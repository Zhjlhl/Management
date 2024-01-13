package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.CourseMapper;
import cn.edu.zjut.management.pojo.Course;
import cn.edu.zjut.management.servive.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course selectCourseById(int id) {
        return courseMapper.selectCourseById(id);
    }

    @Override
    public List<Course> selectAllCourse() {
        return courseMapper.selectAllCourse();
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.addCourse(course);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateCourse(course);
    }

    @Override
    public int deleteCourseById(int id) {
        return courseMapper.deleteCourseById(id);
    }
}
