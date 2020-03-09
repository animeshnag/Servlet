package com.java;

public class Student {

    String rollNo;
    String name;
    String university;
    Student(String rollNo, String name, String university){
        this.rollNo=rollNo;
        this.name=name;
        this.university=university;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String toString(){
        return rollNo + " " + name + " " + university;
    }
}
