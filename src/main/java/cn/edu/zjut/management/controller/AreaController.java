package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Student;
import cn.edu.zjut.management.servive.AreaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/selectAreaById")
    public Area selectAreaById(@RequestParam("areaId") int areaId){
        Area area = areaService.selectAreaById(areaId);
        return area;
    }

    @RequestMapping("/selectStudentByAreaId")
    public List<Student> selectStudentByAreaId(@RequestParam("id") int id){
        return areaService.selectStudentByAreaId(id);
    }
    /*@GetMapping("/selectStudentByAreaId")
    public List<Student> selectStudentByAreaId(@RequestParam("areaId") int areaId){
        Area area = areaService.selectAreaById(areaId);
        List<Student> studentList = new ArrayList<>();
        for (Student student: area.getStudentList()){
            Student student1 = new Student();
            student1.setId(student.getId());
            student1.setAge(student.getAge());
            student1.setName(student.getName());
            student1.setCredits(student.getCredits());
            student1.setClasses(student.getClasses());
            student1.setGender(student.getGender());
            studentList.add(student1);
        }
        return studentList;
    }
*/
    @GetMapping("/selectAllArea")
    public List<Area> selectAllArea(){
        return areaService.selectAllArea();
    }

    @PostMapping(value = "/addArea")
    public int addArea(@RequestBody Area area){
        return areaService.addArea(area);
    }

    @PutMapping("/updateArea")
    public int updateArea(@RequestBody Area area){
        return areaService.updateArea(area);
    }

    @DeleteMapping("/deleteAreaById")
    public int deleteAreaById(@RequestParam("areaId") int id){
        return areaService.deleteAreaById(id);
    }
}
