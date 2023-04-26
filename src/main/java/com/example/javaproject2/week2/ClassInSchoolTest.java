package com.example.javaproject2.week2;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "경기도 광주시 ~~";
        classInSchool.students = new Student[2];
        classInSchool.students[0] = new Student();
        classInSchool.students[0].name = "gd";


        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(classInSchool.teacher.name);
    }
}
