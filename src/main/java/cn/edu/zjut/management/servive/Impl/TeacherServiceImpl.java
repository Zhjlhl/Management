package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.TeacherMapper;
import cn.edu.zjut.management.pojo.Teacher;
import cn.edu.zjut.management.servive.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher selectTeacherById(int id) {
        return teacherMapper.selectTeacherById(id);
    }

    @Override
    public List<Teacher> selectAllTeacher() {
        return teacherMapper.selectAllTeacher();
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    @Override
    public int deleteTeacherById(int id) {
        return teacherMapper.deleteTeacherById(id);
    }
}
