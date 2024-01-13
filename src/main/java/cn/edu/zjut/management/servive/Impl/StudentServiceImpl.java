package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.StudentMapper;
import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student selectStudentById(int id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudentById(int id) {
        return studentMapper.deleteStudentById(id);
    }
}
