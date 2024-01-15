package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Student;

import java.util.List;

public interface AreaService {

    public Area selectAreaById(int id);

    public List<Area> selectAllArea();

    public int addArea(Area area);

    public int updateArea(Area area);

    public int deleteAreaById(int id);

    public List<Student> selectStudentByAreaId(int id);
}
