package cn.edu.zjut.management.pojo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private Area area;
    private Classes classes;
    private float credits;
}
