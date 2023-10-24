package org.example;

import java.util.List;

/**
 * Created by Ozuru Chimene on 20th October 2023
 * implement Teachers and Students using an array list
 * school can house many Teachers, and Students
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     *new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @param teacher adds teacher to the list
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     *
     * @param  student students to be added to the school
     */

    public void addStudents(Student student) {
        students.add(student);
    }
    /**
     *
     * @return totalMoneyEarned by the school
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     *
     * @param  MoneyEarned adds money earned in the school
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    /**
     *
     * @return totalMoneySpent by the school
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * updtes the money spent by the school in paying salaries of teachers.
     * @param  moneySpent by the school
     */

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= totalMoneySpent;
       // totalMoneyEarned=totalMoneyEarned-moneySpent; // same thing with previous line
    }
}
