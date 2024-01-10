package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Classes;
import org.apache.ibatis.annotations.*;

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
}
