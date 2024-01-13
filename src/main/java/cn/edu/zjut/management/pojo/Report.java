package cn.edu.zjut.management.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Report {
    private int id;
    private Student student;
    private Course course;
    private Teacher teacher;
    private float score;
}
