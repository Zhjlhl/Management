package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.AreaMapper;
import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.servive.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public Area selectAreaById(int id) {
        return areaMapper.selectAreaById(id);
    }
}
