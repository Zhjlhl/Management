package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Classes;
import cn.edu.zjut.management.servive.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @RequestMapping("/selectClassesById")
    public Classes selectClassesById(@RequestParam int id) {
        return classesService.selectClassesById(id);
    }

    @RequestMapping("/selectAllClasses")
    public List<Classes> selectAllClasses() {
        return classesService.selectAllClasses();
    }

    @PostMapping(value = "/addClasses")
    public int addClasses(@RequestBody Classes classes) {
        return classesService.addClasses(classes);
    }

    @PutMapping("/updateClasses")
    public int updateClasses(@RequestBody Classes classes) {
        return classesService.updateClasses(classes);
    }

    @DeleteMapping("/deleteClassesById")
    public int deleteClasses(@RequestParam int id) {
        return classesService.deleteClasses(id);
    }
}
