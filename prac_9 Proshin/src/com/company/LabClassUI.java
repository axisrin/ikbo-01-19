package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LabClassUI  {

    private static Object Number;

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Students will create ? : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Let go \n");
        for (int i = 0; i < n; i++){
            System.out.println("Input name and GPA : ");
            students.add(new Student(scanner.next(),scanner.nextInt()));
        }


        LabClass.sortStudents(students, 0, students.size() - 1);

        System.out.println("Sort results:");
        for(Student it: students)
            System.out.println(it.toString());

        System.out.println("Sign the name of Student to try find him or enter 0 to close : ");
        String desiredStudent = scanner.next();
        try {
            if (!desiredStudent.equals("0")) {
                Student temp = LabClass.searchStudentByHisName(students, desiredStudent);
                System.out.println(temp.toString());
            }
        } catch (EmptyStringExeption e) {
            if (desiredStudent.equals(Number))
                throw new EmptyStringExeption(desiredStudent + " do not expect input",e);
            e.printStackTrace();
        }
    }
}
