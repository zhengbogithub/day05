package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "tb_student")
public class Student implements Serializable {
    @Id
    @Column(name = "tb_student_id")
    private Integer tbStudentId;

    @Column(name = "tb_student_name")
    private String tbStudentName;

    @Column(name = "tb_student_sex")
    private String tbStudentSex;

    @Column(name = "tb_student_age")
    private Integer tbStudentAge;

    @Column(name = "tb_student_img")
    private String tbStudentImg;

    @Column(name = "tb_student_birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date tbStudentBirthday;

    @Column(name = "tb_student_tid")
    private Integer tbStudentTid;

    private static final long serialVersionUID = 1L;

    /**
     * @return tb_student_id
     */
    public Integer getTbStudentId() {
        return tbStudentId;
    }

    /**
     * @param tbStudentId
     */
    public void setTbStudentId(Integer tbStudentId) {
        this.tbStudentId = tbStudentId;
    }

    /**
     * @return tb_student_name
     */
    public String getTbStudentName() {
        return tbStudentName;
    }

    /**
     * @param tbStudentName
     */
    public void setTbStudentName(String tbStudentName) {
        this.tbStudentName = tbStudentName == null ? null : tbStudentName.trim();
    }

    /**
     * @return tb_student_sex
     */
    public String getTbStudentSex() {
        return tbStudentSex;
    }

    /**
     * @param tbStudentSex
     */
    public void setTbStudentSex(String tbStudentSex) {
        this.tbStudentSex = tbStudentSex == null ? null : tbStudentSex.trim();
    }

    /**
     * @return tb_student_age
     */
    public Integer getTbStudentAge() {
        return tbStudentAge;
    }

    /**
     * @param tbStudentAge
     */
    public void setTbStudentAge(Integer tbStudentAge) {
        this.tbStudentAge = tbStudentAge;
    }

    /**
     * @return tb_student_img
     */
    public String getTbStudentImg() {
        return tbStudentImg;
    }

    /**
     * @param tbStudentImg
     */
    public void setTbStudentImg(String tbStudentImg) {
        this.tbStudentImg = tbStudentImg == null ? null : tbStudentImg.trim();
    }

    /**
     * @return tb_student_birthday
     */
    public Date getTbStudentBirthday() {
        return tbStudentBirthday;
    }

    /**
     * @param tbStudentBirthday
     */
    public void setTbStudentBirthday(Date tbStudentBirthday) {
        this.tbStudentBirthday = tbStudentBirthday;
    }

    /**
     * @return tb_student_tid
     */
    public Integer getTbStudentTid() {
        return tbStudentTid;
    }

    /**
     * @param tbStudentTid
     */
    public void setTbStudentTid(Integer tbStudentTid) {
        this.tbStudentTid = tbStudentTid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbStudentId=").append(tbStudentId);
        sb.append(", tbStudentName=").append(tbStudentName);
        sb.append(", tbStudentSex=").append(tbStudentSex);
        sb.append(", tbStudentAge=").append(tbStudentAge);
        sb.append(", tbStudentImg=").append(tbStudentImg);
        sb.append(", tbStudentBirthday=").append(tbStudentBirthday);
        sb.append(", tbStudentTid=").append(tbStudentTid);
        sb.append("]");
        return sb.toString();
    }
}