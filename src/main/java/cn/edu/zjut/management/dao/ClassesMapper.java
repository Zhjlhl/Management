package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Classes;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassesMapper {

    @Select("SELECT * FROM management.may_class WHERE my_Mid=#{id}")
    @Results(id = "selectClasses", value = {
            @Result(property = "id", column = "my_Classid"),
            @Result(property = "name", column = "my_Classname"),
            @Result(property = "major", column = "my_Mid",
            one = @One(select = "cn.edu.zjut.management.dao.MajorMapper.selectMajorById"))
    })
    public Classes selectClassesById(int id);

    @Select("SELECT * FROM management.may_class")
    @ResultMap("selectClasses")
    public List<Classes> selectAllClasses();

    @Insert("INSERT INTO management.may_class VALUES (#{id}, #{name}, #{major.id})")
    public int addClasses(Classes classes);

    @Update("UPDATE management.may_class SET my_Classid=#{id}, my_Classname=#{name}, my_Mid=#{major.id} WHERE my_Classid=#{id}")
    public int updateClasses(Classes classes);

    @Delete("DELETE FROM management.may_class WHERE my_Classid=#{id}")
    public int deleteClasses(int id);
}
