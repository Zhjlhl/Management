package cn.edu.zjut.management.controller;


import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Classes;
import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.StudentService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/selectStudentById")
    public Student selectStudentById(@RequestParam("studentId") int studentId){

        return studentService.selectStudentById(studentId);
    }

    @RequestMapping("/selectAllStudent")
    public List<Student> selectAllStudent(){
        List<Student> students = studentService.selectAllStudent();
        return students;
    }

    @PostMapping(value = "/addStudent")
    public int addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public int updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("deleteStudentById")
    public int deleteStudentById(@RequestParam("id") int id){
        return studentService.deleteStudentById(id);
    }

}
