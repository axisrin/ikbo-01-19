package com.company;

import java.util.Comparator;
import java.util.Scanner;

public class Student {
    int iDNumber;
    public String name;
    int totalMarks;

    public Student()
    {

        iDNumber = 0;
        name = "Nu";
        totalMarks = 0;

    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int marks) {
        this.totalMarks = marks;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(int iDNumber,String name, int GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.totalMarks = GPA;
    }

}

/*class SortingStudentsByGPA implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getTotalMarks() - o2.getTotalMarks();
    }

    public SortingStudentsByGPA(){

        Scanner scanner = new Scanner(System.in);

        int begin = 0;
        int end;
        Student[] students = new Student[5];
        int ID;
        int GPA;
        String name;
        end = students.length;

        for (int i = 0; i < students.length; i++)
        {

            name = scanner.next();
            ID = scanner.nextInt();
            GPA = scanner.nextInt();
            students[i].setiDNumber(ID);
            students[i].setName(name);
            students[i].setTotalMarks(GPA);

        }

        for (int i = 0; i < students.length; i++)
        {

            System.out.println("Student : " + students[i].getName() +
                    " Id : " + students[i].getiDNumber() + " GPA : " + students[i].getTotalMarks());

        }


        SortStudents(students,begin,end-1);


        for (int i = 0; i < students.length; i++)
        {

            System.out.println("Student : " + students[i].getName() +
            " Id : " + students[i].getiDNumber() + " GPA : " + students[i].getTotalMarks());

        }

    }

    void SortStudents(Student[] students,int begin,int end) {
        int l = begin;
        int r = end;
        int v = students[l + (r - l) / 2].totalMarks;
        while (l <= r) {
            while (students[l].totalMarks < v) l++;
            while (students[r].totalMarks > v) r--;
            if (compare(students[l], students[r]) <= 0) {
                int tmp = students[l].totalMarks;
                students[l].totalMarks = students[r].totalMarks;
                students[r].totalMarks = tmp;
                l++;
                r++;
            }
        }
        if (begin < r)
            SortStudents(students, begin, r);
        if (l < end)
            SortStudents(students, l, end);
    }
}*/

/*
class SortStudents
{
    SortStudents(Student[] students,int begin,int end) {
        int l = begin;
        int r = end;
        int v = students[l + (r - l) / 2].totalMarks;
        while (l <= r) {
            while (students[l].totalMarks < v) l++;
            while (students[r].totalMarks > v) r--;
            if (l <= r) {
                int tmp = students[l].totalMarks;
                students[l].totalMarks = students[r].totalMarks;
                students[r].totalMarks = tmp;
                l++;
                r++;
            }
        }
        if (begin < r)
            SortStudents(students[], begin, r);
        if (l < end)
            SortStudents(students, l, end);
    }*/
