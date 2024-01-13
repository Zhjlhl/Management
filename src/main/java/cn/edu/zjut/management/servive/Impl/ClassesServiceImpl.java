package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.ClassesMapper;
import cn.edu.zjut.management.pojo.Classes;
import cn.edu.zjut.management.servive.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesMapper classesMapper;


    @Override
    public Classes selectClassesById(int id) {
        return classesMapper.selectClassesById(id);
    }

    @Override
    public List<Classes> selectAllClasses() {
        return classesMapper.selectAllClasses();
    }

    @Override
    public int addClasses(Classes classes) {
        return classesMapper.addClasses(classes);
    }

    @Override
    public int updateClasses(Classes classes) {
        return classesMapper.updateClasses(classes);
    }

    @Override
    public int deleteClasses(int id) {
        return classesMapper.deleteClasses(id);
    }
}
