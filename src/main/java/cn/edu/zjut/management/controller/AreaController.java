package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.servive.AreaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
