package org.example;
/**
 * Created by Ozuru Chimene on 20th October 2023
 * Class responsible for keeping tracks of
 * students, fees, names, grades, id and fees paid
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**create a Constructor: to create a new student object by initializing the values
     * Fees for students will be naira 150,000.
     * @param id id of students
     * @param name name of students
     * @param grade grades of students
     */
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 150000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter student name
/**
 * used to update the student's grade.
 * @param grade new grade of the student.
 */

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keeps adding fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school will receive funds.
     *
     * @param fees the fees that the student paid.
     */
    public void payFees(int fees){
        feesPaid+= fees;
        School.updateTotalMoneyEarned(feesPaid);


    }

    /**
     * Return
     * @return id of student
     */

    public int getId() {
        return id;
    }
    /**
     * Return
     * @return name of student
     */

    public String getName() {
        return name;
    }
    /**
     * Return
     * @return grade of student
     */

    public int getGrade() {
        return grade;
    }
    /**
     * Return
     * @return feesPaid of student
     */

    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     * Return
     * @return feesTotal of student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return returns balance of fees
     */
    public int updateBalFees(){
     return feesTotal-feesPaid;
    }
}
