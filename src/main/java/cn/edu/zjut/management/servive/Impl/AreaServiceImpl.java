package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.AreaMapper;
import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.servive.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public Area selectAreaById(int id) {
        return areaMapper.selectAreaById(id);
    }

    @Override
    public List<Area> selectAllArea() {
        return areaMapper.selectAllArea();
    }

    @Override
    public int addArea(Area area) {
        return areaMapper.addArea(area);
    }

    @Override
    public int updateArea(Area area) {
        return areaMapper.updateArea(area);
    }

    @Override
    public int deleteAreaById(int id) {
        return areaMapper.deleteAreaById(id);
    }
}
