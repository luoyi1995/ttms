package cn.zust.ttms.courseware.entity;

import java.util.Date;

public class CoursewareType {
    private int id;                      //类别id
    private String typeName;             //类别名
    private String note;                 //备注
    private String createdPerson;        //创建人
    private Date createdTime;            //创建时间
    private String modifiedPerson;      //修改人
    private Date modifiedTime;          //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedPerson() {
        return createdPerson;
    }

    public void setCreatedPerson(String createdPerson) {
        this.createdPerson = createdPerson;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedPerson() {
        return modifiedPerson;
    }

    public void setModifiedPerson(String modifiedPerson) {
        this.modifiedPerson = modifiedPerson;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
