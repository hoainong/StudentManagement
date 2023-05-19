package com.hoainong.model;

import java.util.List;

public class ClassRoom {
    private String nameClass;
    private List<Student> listStudents;

    public ClassRoom() {
    }

    public ClassRoom(String nameClass, List<Student> listStudents) {
        this.nameClass = nameClass;
        this.listStudents = listStudents;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
}
