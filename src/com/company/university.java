package com.company;

import java.util.ArrayList;
import java.util.List;

public class university {
    List<String> students=new ArrayList<>();
    String instructorName;
    String courseName;

    university(String instructor,String courseName){
        this.courseName=courseName;
        this.instructorName=instructor;
    }

    void registration(String studentname){
        students.add(studentname);
    }
    void drop(String studentname){
        students.remove(studentname);
    }
}
