package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.servive.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/selectAreaById")
    public Area selectAreaById(@RequestParam("areaId") int areaId){
        Area area = areaService.selectAreaById(areaId);
        return area;
    }
}
