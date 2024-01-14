package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Teacher;
import cn.edu.zjut.management.servive.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        List<Teacher> teachers = teacherService.selectAllTeacher();
        return teachers;
    }

    @RequestMapping("addTeacher/{id}/{name}/{gender}/{age}/{position}/{phone}")
    public int addTeacher(@PathVariable("id") int id,
                          @PathVariable("name") String name,
                          @PathVariable("gender") String gender,
                          @PathVariable("age") int age,
                          @PathVariable("position") String position,
                          @PathVariable("phone") String phone){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setGender(gender);
        teacher.setAge(age);
        teacher.setPosition(position);
        teacher.setPhone(phone);
        return teacherService.addTeacher(teacher);

    }

    @RequestMapping("/updateTeacher/{id}/{name}/{gender}/{age}/{position}/{phone}")
    public int upateTeacher(@PathVariable("id") int id,
                            @PathVariable("name") String name,
                            @PathVariable("gender") String gender,
                            @PathVariable("age") int age,
                            @PathVariable("position") String position,
                            @PathVariable("phone") String phone){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setGender(gender);
        teacher.setAge(age);
        teacher.setPosition(position);
        teacher.setPhone(phone);
        return teacherService.updateTeacher(teacher);
    }

    @RequestMapping("/deleteTeacherById")
    public int deleteTeacherById(@RequestParam("teacherId") int id){

        return teacherService.deleteTeacherById(id);
    }

}
