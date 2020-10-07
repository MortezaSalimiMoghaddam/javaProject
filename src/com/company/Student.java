package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    public Student(String fName , String lName , String sId)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.id = sId;
        this.grade = 0;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public void setGrade(int grade ){
        this.grade = grade;
    }
    public void print(){
        System.out.println(firstName + lastName + ", student ID: "
                + id + ", grade: "+grade);
    }

}
