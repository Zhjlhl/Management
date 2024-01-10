package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.StudentMapper;
import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student findStudentById(int id) {
        return null;
    }
}
