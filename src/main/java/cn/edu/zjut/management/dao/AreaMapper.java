package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AreaMapper {

    @Select("SELECT * FROM management.may_area WHERE my_Aid=#{id}")
    @Results(id = "selectArea", value = {
            @Result(property = "id", column = "my_Aid"),
            @Result(property = "name", column = "my_Aname")
    })
    public Area selectAreaById(int id);

    @Select("SELECT * FROM management.may_area")
    public List<Area> selectAllArea();

    public int addArea(Area area);

    public int updateArea(Area area);

    public int deleteAreaById(int id);
}
