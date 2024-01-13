package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Course;

import java.util.List;

public interface CourseService {

    public Course selectCourseById(int id);

    public List<Course> selectAllCourse();

    public int addCourse(Course course);

    public int updateCourse(Course course);

    public int deleteCourseById(int id);
}
