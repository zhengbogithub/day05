package com.xiaoshu.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.dao.TeacherMapper;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;
import com.xiaoshu.entity.Teacher;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private TeacherMapper teacherMapper;

	public PageInfo<StudentVo> findPage(StudentVo studentVo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> slist=studentMapper.findAll(studentVo);
		return new PageInfo<>(slist);
	}

	public Student findByName(String tbStudentName) {
		Student student = new Student();
		student.setTbStudentName(tbStudentName);
		Student s = studentMapper.selectOne(student);
		return s;
	}

	public void update(Student student) {
		studentMapper.updateByPrimaryKeySelective(student);
		
	}

	public void add(Student student) {
		studentMapper.insert(student);
		
	}

	public void delete(int parseInt) {
		studentMapper.deleteByPrimaryKey(parseInt);
		
	}

	public void importS(MultipartFile importFile) throws InvalidFormatException, IOException {
		Workbook wb = WorkbookFactory.create(importFile.getInputStream());
		Sheet sheet = wb.getSheetAt(0);
		int num = sheet.getLastRowNum();
		for (int i = 0; i <num; i++) {
			Row row = sheet.getRow(i+1);
			String name = row.getCell(0).toString();
			String sex = row.getCell(1).equals("男")?"1":"0";
			int age = (int) row.getCell(2).getNumericCellValue();
			String img = row.getCell(3).toString();
			Date birthday = row.getCell(4).getDateCellValue();
			String tname = row.getCell(5).toString();
			Student student = new Student();
			student.setTbStudentName(name);
			student.setTbStudentSex(sex);
			student.setTbStudentAge(age);
			student.setTbStudentImg(img);
			student.setTbStudentBirthday(birthday);
			Teacher teacher=findByTname(tname);
			student.setTbStudentTid(teacher.getTid());
			add(student);
		}
		
		
	}

	private Teacher findByTname(String tname) {
		Teacher teacher = new Teacher();
		teacher.setTname(tname);
		return teacherMapper.selectOne(teacher);
	}

	public   List<StudentVo> findS(StudentVo studentVo) {
		List<StudentVo> slist=studentMapper.findAll(studentVo);
		return slist;
	}
	
}
