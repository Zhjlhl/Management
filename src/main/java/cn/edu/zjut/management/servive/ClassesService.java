package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Classes;

import java.util.List;

public interface ClassesService {
    public Classes selectClassesById(int id);

    public List<Classes> selectAllClasses();

    public int addClasses(Classes classes);

    public int updateClasses(Classes classes);

    public int deleteClasses(int id);
}
