package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Course;
import cn.edu.zjut.management.servive.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/selectCourseById")
    public Course selectCourseById(@RequestParam("id") int id){
        Course course = courseService.selectCourseById(id);
        return course;
    };

    @RequestMapping("/selectAllCourse")
    public List<Course> selectAllCourse(){
        List<Course> courses = courseService.selectAllCourse();
        return courses;
    };

    @RequestMapping("/addCourse")
    public int addCourse(@RequestParam);
}
