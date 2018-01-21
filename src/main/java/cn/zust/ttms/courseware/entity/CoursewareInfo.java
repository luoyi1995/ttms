package cn.zust.ttms.courseware.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CoursewareInfo {
    private int id;                        //课程id
    private String coursewareName;         //课程名
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date uploadTime;               //上传时间
    private int typeId;                    //类别id
    private String note;                   //备注
    private String uploadPerson;           //上传人

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursewareName() {
        return coursewareName;
    }

    public void setCoursewareName(String coursewareName) {
        this.coursewareName = coursewareName;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUploadPerson() {
        return uploadPerson;
    }

    public void setUploadPerson(String uploadPerson) {
        this.uploadPerson = uploadPerson;
    }

}
