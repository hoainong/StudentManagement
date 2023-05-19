package com.hoainong.model;

public class Student {
    private String id;
    private String name;
    private Double gpa;

    public Student() {
    }

    public Student(String id, String name, Double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    public String categorize(Double gpa) {
    	
        if (gpa == null || gpa < 0 || gpa > 10.0) {
            return "ĐIỂM KHÔNG HỢP LỆ";
        } else {
            if (gpa < 3) {
                return "YẾU";
            } else if (gpa < 5.0) {
                return "TRUNG BÌNH";
            } else if (gpa < 8.0) {
                return "KHÁ";
            } else {
                return "XUẤT SẮC";
            }
        }
    }
}

