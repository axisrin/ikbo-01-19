package com.company;

import java.util.Comparator;
import java.util.Scanner;

class SortingStudentsByGPA implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getTotalMarks() - o2.getTotalMarks();
    }

    public void SortingStudentsByMERGE(){

        Scanner scanner = new Scanner(System.in);

        int begin = 0;
        int end;
        Student[] arrayStudents = new Student[5];
        int iDSt;
        int sGPA;
        String name;
        end = arrayStudents.length;

        for (int i = 0; i < arrayStudents.length; i++)
        {

            arrayStudents[i] = new Student();
            name = scanner.next();
            iDSt = scanner.nextInt();
            sGPA = scanner.nextInt();
            arrayStudents[i].setiDNumber(iDSt);
            arrayStudents[i].setName(name);
            arrayStudents[i].setTotalMarks(sGPA);

        }

        mergeSort(arrayStudents,end);

        for (int i = 0; i < arrayStudents.length; i++)
        {

            System.out.println("Student : " + arrayStudents[i].getName() +
                    " Id : " + arrayStudents[i].getiDNumber() + " GPA : " + arrayStudents[i].getTotalMarks());

        }

    }

    public static void mergeSort(Student[] students, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = students[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = students[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(students, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        SortingStudentsByGPA sSBGPA = new SortingStudentsByGPA();
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (sSBGPA.compare(l[i],r[j]) >= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public SortingStudentsByGPA(){

//        Scanner scanner = new Scanner(System.in);
//
//        int begin = 0;
//        int end;
//        Student[] arrayStudents = new Student[5];
//        int iDSt;
//        int sGPA;
//        String name;
//        end = arrayStudents.length;
//
//        for (int i = 0; i < arrayStudents.length; i++)
//        {
//
//            arrayStudents[i] = new Student();
//            name = scanner.next();
//            iDSt = scanner.nextInt();
//            sGPA = scanner.nextInt();
//            arrayStudents[i].setiDNumber(iDSt);
//            arrayStudents[i].setName(name);
//            arrayStudents[i].setTotalMarks(sGPA);
//
//        }
//
//        sortStudents(arrayStudents,begin,end-1);
//
//
//        for (int i = 0; i < arrayStudents.length; i++)
//        {
//
//            System.out.println("Student : " + arrayStudents[i].getName() +
//                    " Id : " + arrayStudents[i].getiDNumber() + " GPA : " + arrayStudents[i].getTotalMarks());
//
//        }

    }

    /*void SortStudents(Student[] students,int begin,int end) {
        int l = begin;
        int r = end;
        int v = students[r / 2].totalMarks;
        while (l <= r) {
            while (students[l].totalMarks < v) l++;
            while (students[r].totalMarks > v) r--;
            if (compare(students[l], students[r]) <= 0) {
                Student tmp = students[l];
                students[l] = students[r];
                students[r] = tmp;
                l++;
                r++;
            }
        }
        if (begin < r)
            SortStudents(students, begin, r);
        if (l < end)
            SortStudents(students, l, end);
    }*/

    public static void sortStudents(Student[] students, int low, int high) {
        if (students.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = students[middle].totalMarks;

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (students[i].totalMarks > opora) {
                i++;
            }

            while (students[j].totalMarks < opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sortStudents(students, low, j);

        if (high > i)
            sortStudents(students, i, high);
    }

}