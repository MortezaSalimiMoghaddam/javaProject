package com.company;

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /*
     *@param capacity of lab
     *@param day of lab
     */
    public Lab(int cap, String d) {
        this.capacity = cap;
        this.day = d;
        this.currentSize = 0;
        this.avg = 0;
    }

    /*
     *@param student of lab
     * this method takes students and add them to the lab class
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("lab is full");
        }
    }

    /*
     *this method prints all lab students
     */
    public void print() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("std fname: " + students[i].getFirstName()
                    + "std grade" + students[i].getGrade());
        }
        System.out.println("Lab avg: " + avg);
    }

    /*
     *this method gets the array of students
     * @return students of the lab
     */
    public Student[] getStudents() {
        return students;
    }

    /*
     *@param students of lab
     * this method sets the students of the class
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }
    /*
     *this method gets the avg of lab class
     * @return avg of the students
     */
    public int getAvg() {
        return avg;
    }
    /*
     *this method calculates the avg grade of the students of lab
     */
    public void calculateAvg(){
        for(int i = 0 ; i < students.length; i++){
            avg += students[i].getGrade();
        }
        this.avg /= students.length;
    }
    /*
     * this methode returns the day of lab class
     * @return the day of class
     */
    public String getDay(){
        return day;
    }
    /*
     * this methode sets the day of class
     * @param the day of class
     */
    public void setDay(String day){
        this.day = day;
    }
    /*
     * this methode gets the capacity of the class
     * @return the capacity of the class
     */
    public int getCapacity(){
        return this.capacity;
    }
    /*
     *this methode sets the capacity of the class
     * @param capacity of the class
     */
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}

