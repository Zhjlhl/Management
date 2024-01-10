package cn.edu.zjut.management.controller;


import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/demo_01")
    public Student demo_01(){
        Student student = new Student();
        student.setId(1);
        student.setName("my");
        studentService.findStudentById(1);
        return student;
    }
}
