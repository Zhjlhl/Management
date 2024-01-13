package cn.edu.zjut.management.controller;


import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Classes;
import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/selectStudentById")
    public Student selectStudentById(@RequestParam("studentId") int studentId){

        return studentService.selectStudentById(studentId);
    }

    @RequestMapping("/addStudent")
    public int addStudent(@RequestParam("studentId") int id,
                          @RequestParam("studentName") String name,
                          @RequestParam("areaId") int areaId,
                          @RequestParam("classesId") int classesId){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        Area area = new Area();
        area.setId(areaId);
        Classes classes = new Classes();
        classes.setId(classesId);
        student.setArea(area);
        student.setClasses(classes);
        return studentService.addStudent(student);
    };

}
