package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Course;
import cn.edu.zjut.management.servive.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return courseService.selectAllCourse();
    };

    @PostMapping(value = "/addCourse")
    public int addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse")
    public int updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/deleteCourseById")
    public int deleteCourseById(@RequestParam int id) {
        return courseService.deleteCourseById(id);
    }

}
