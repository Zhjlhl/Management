package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Course;
import cn.edu.zjut.management.pojo.Major;
import cn.edu.zjut.management.servive.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MajorController {
    @Autowired
    public MajorService majorService;

    @RequestMapping("/selectMajorById")
    public Major selectMajorById(@RequestParam int id) {
        return majorService.selectMajorById(id);
    }

    @RequestMapping("/selectAllMajor")
    public List<Major> selectAllMajor() {
        return majorService.selectAllMajor();
    }

    @PostMapping(value = "/addMajor")
    public int addMajor(@RequestBody Major major) {
        return majorService.addMajor(major);
    }

    @PutMapping("/updateMajor")
    public int updateMajor(@RequestBody Major major) {
        return majorService.updateMajor(major);
    }

    @DeleteMapping("/deleteMajorById")
    public int deleteMajor(@RequestParam int id) {
        return majorService.deleteMajor(id);
    }
}
