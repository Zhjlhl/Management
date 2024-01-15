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
           /* @Result(property = "studentList", column = "my_Aid",
                    many = @Many(select = "cn.edu.zjut.management.dao.StudentMapper.selectStudentByAreaId"))*/
    })
    public Area selectAreaById(int id);

    @Select("SELECT * FROM management.may_area")
    @ResultMap("selectArea")
    public List<Area> selectAllArea();

    @Insert("INSERT INTO management.may_area(my_Aid, my_Aname) VALUES(#{id}, #{name})")
    public int addArea(Area area);

    @Update("UPDATE management.may_area SET my_Aid=#{id}, my_Aname=#{name} WHERE my_Aid=#{id}")
    public int updateArea(Area area);

    @Delete("DELETE FROM management.may_area WHERE my_Aid=#{id}")
    public int deleteAreaById(int id);
}
