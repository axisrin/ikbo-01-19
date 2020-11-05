package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LabClass {

        public static void sortStudents(ArrayList<Student> arr, int l, int h){
        if(arr.size() == 0)
            return;

        if(l >= h)
            return;

        int middle = l + (h-l)/2;
        Student midElem = arr.get(middle);

        int i = l, j = h;
        while (i<=j){
            while (arr.get(i).getMark() > midElem.getMark())
                i++;
            while (arr.get(j).getMark() < midElem.getMark())
                j--;
            if(i <= j){
                Collections.swap(arr, i, j);
                i++;
                j--;
            }
        }

        if(l < j)
            sortStudents(arr, l, j);
        if(h > i)
            sortStudents(arr, i, h);
    }

    public static Student searchStudentByHisName(ArrayList<Student> studentArrayList,String studentName)
    {
            int index = 0;
            while (studentArrayList.size() != index) {
                if (studentArrayList.get(index).getName().equals(studentName))
                { return studentArrayList.get(index); }
                else { index += 1; }
            }
            throw new StudentNotFoundExeption("A student with the name " + studentName
            + " is not found", null);
    }

}
