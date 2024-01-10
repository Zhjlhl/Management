package cn.edu.zjut.management.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private String semesters;
    private int hours;
    private String examType;
    private float credits;
    private Classes classes;
    private String position;
}
