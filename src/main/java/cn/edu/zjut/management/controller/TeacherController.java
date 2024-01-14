package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Teacher;
import cn.edu.zjut.management.servive.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/selectTeacherById")
    public Teacher selectTeacherById(@RequestParam("teacherId") int teacherId){
        Teacher teacher = teacherService.selectTeacherById(teacherId);
        return teacher;
    }

    @RequestMapping("/selectAllTeacher")
    public List<Teacher> selectAllTeacher(){
        return teacherService.selectAllTeacher();

    }

    @PostMapping(value = "addTeacher")
    public int addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);

    }

    @PutMapping("/updateTeacher")
    public int updateTeacher(@RequestBody Teacher teacher){
        return teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/deleteTeacherById")
    public int deleteTeacherById(@RequestParam("teacherId") int id){
        return teacherService.deleteTeacherById(id);
    }

}
