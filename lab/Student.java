package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    /*
     * @param firstName set first name of student
     * @param lastName set last name of student
     * @param id set id of student
     */
    public Student(String fName , String lName , String sId)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.id = sId;
        this.grade = 0;
    }
    /*
     * get first name of student
     * @return firstname field
     */
    public String getFirstName(){
        return firstName;
    }
    /*
     *get grade of the student
     * @return grade field
     */
    public int getGrade(){
        return grade;
    }
    /*
     *@param first name of student
     */
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    /*
     *@param grade of student
     */
    public void setGrade(int grade ){
        this.grade = grade;
    }
    /*
     * prints the information of student
     */
    public void print(){
        System.out.println(firstName + lastName + ", student ID: "
                + id + ", grade: "+grade);
    }
}


