package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Chimene = new Teacher(1, "Ozuru Chimene", 190000);
        Teacher Ryan = new Teacher(1, "Ryan Douglas", 100000);
        Teacher Peace = new Teacher(1, "Peace Davies", 170000);
        Teacher Daro = new Teacher(1, "Gardibia Daro", 195000);
        Teacher Solanke = new Teacher(1, "Olamilekan Solanke", 20000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Chimene);
        teacherList.add(Ryan);
        teacherList.add(Peace);
        teacherList.add(Daro);
        teacherList.add(Solanke);


        Student Ofofonono = new Student(1, "Ofofonono Adams", 4);
        Student Emmanuel = new Student(1, "Emmanuel Richards", 2);
        Student James = new Student(1, "James Dickson", 2);
        Student Peter = new Student(1, "Peter Parker", 5);
        Student Philip = new Student(1, "Simon Philips", 3);
        Student Temitokpe = new Student(1, "Taiwo Temitokpe", 1);
        Student Wumi = new Student(1, "Wumi Fumilayo", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Ofofonono);
        studentList.add(Emmanuel);
        studentList.add(James);
        studentList.add(Peter);
        studentList.add(Philip);
        studentList.add(Temitokpe);
        studentList.add(Wumi);
        List<Student> students = null;
        System.out.println(students);


        School decagon = new School(teacherList, studentList);


        Peter.payFees(3500000);
        Ofofonono.payFees(3500000);

        System.out.println("Decagon has earned $" + decagon.getTotalMoneyEarned());
        System.out.println("Decagon pay internship to Students");
        Chimene.receiveSalary(Chimene.getSalary());
        System.out.println("Decagon has paid " + Chimene.getName() + " his salary" + decagon.getTotalMoneyEarned());
        // System.out.println("Decagon now has $" + decagon.getTotalMoneyEarned());

        students = new ArrayList<>();
        System.out.println(students);

    }
}