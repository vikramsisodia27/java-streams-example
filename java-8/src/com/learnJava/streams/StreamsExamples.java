package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples {
    public static void main(String[] args) {
        //print_name();
        //print_name_list();
        //print_name_list_uppercase();
        //distinct_activities();
        //distinct_activities_count();
        distinct_sorted_activities();
    }

    public  static void print_name(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.stream().map(Student::getName).forEach(System.out::println);
    }

    public  static void print_name_list(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        List<String> namesList = studentList.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(namesList);
    }

    public  static void print_name_list_uppercase(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        List<String> namesList = studentList.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesList);
    }

    public  static void distinct_activities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        List<String> activitiesList = studentList.stream().map(Student::getActivities).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(activitiesList);
    }

    public  static void distinct_activities_count(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        long activitiesCount = studentList.stream().map(Student::getActivities).flatMap(List::stream).distinct().count();
        System.out.println(activitiesCount);
    }

    public  static void distinct_sorted_activities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        List<String> activitiesList = studentList.stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(activitiesList);
    }

}
