package org.example;
/**
 * Created by Ozuru Chimene on 20th October 2023
 * Class responsible for keeping tracks of
 * Teachers, id, names and salary
 */
public class Teacher {
    private int id;
    private int salary;
    private String name;
    private double salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param id id of Teacher
     * @param name name of Teacher
     * @param salary salary of Teacher
     */

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name =  name;
        this.salary = salary;
        this.salaryEarned=0;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    /**
     * update the salary
     * @param salary
     */
    public void setSalary(int salary){
       this.salary = salary;
    }

    /**
     * teacher receives salary which in turn removes total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
      salaryEarned-=salary;
      School.updateTotalMoneySpent(salary);
    }
}
