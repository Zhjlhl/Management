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

    @RequestMapping("/selectAreaById")
    public Area selectAreaById(@RequestParam("areaId") int areaId){
        Area area = areaService.selectAreaById(areaId);
        return area;
    }

    @GetMapping("/selectAllArea")
    public List<Area> selectAllArea(){
        List<Area> areas = areaService.selectAllArea();
        return areas;
    }

    @GetMapping("/addArea/{id}/{name}")
    public int addArea(@PathVariable("id") int id,
                       @PathVariable("name") String name){
        Area area = new Area();
        area.setId(id);
        area.setName(name);
        System.out.println(id);
        System.out.println(name);
        return areaService.addArea(area);
    }

    @GetMapping("/updateArea/{id}/{name}")
    public int updateArea(@PathVariable("id") int id,
                       @PathVariable("name") String name){
        Area area = new Area();
        area.setId(id);
        area.setName(name);
        System.out.println(id);
        System.out.println(name);
        return areaService.updateArea(area);
    }

    @GetMapping("/deleteAreaById/{id}")
    public int deleteAreaById(@PathVariable("id") int id){
        /*Area area = new Area();
        area.setId(id);
        area.setName(name);
        System.out.println(id);
        System.out.println(name);*/
        return areaService.deleteAreaById(id);
    }
}
