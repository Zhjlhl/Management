package cn.edu.zjut.management.controller;


import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/selectStudentById")
    public Student selectStudentById(@RequestParam("studentId") int studentId){

        return studentService.selectStudentById(studentId);
    }
}
