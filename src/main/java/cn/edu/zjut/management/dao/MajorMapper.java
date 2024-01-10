package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MajorMapper {

    @Select("SELECT * FROM management.may_major WHERE my_Mid=#{id}")
    @Results(id = "selectMajor", value = {
            @Result(property = "id", column = "my_Mid"),
            @Result(property = "name", column = "my_Mname")
    })
    public Major selectMajorById(int id);
}
