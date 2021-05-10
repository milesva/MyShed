package com.example.myapplication.database.enity;

public class ItemShed {
    private String time;
    private String object;
    private String address;
    private String teacher;
    private String group;

    public ItemShed(){
    }

    public ItemShed(String time, String object, String address, String teacher, String group){
        this.time=time;
        this.object=object;
        this.address=address;
        this.teacher=teacher;
        this.group=group;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
