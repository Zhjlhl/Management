package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Major;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MajorMapper {

    @Select("SELECT * FROM management.may_major WHERE my_Mid=#{id}")
    @Results(id = "selectMajor", value = {
            @Result(property = "id", column = "my_Mid"),
            @Result(property = "name", column = "my_Mname")
    })
    public Major selectMajorById(int id);

    @Select("SELECT * FROM management.may_major")
    @ResultMap("selectMajor")
    public List<Major> selectAllMajor();

    @Insert("INSERT INTO management.may_major VALUES (#{id}, #{name})")
    public int addMajor(Major major);

    @Update("UPDATE management.may_major SET my_Mid=#{id}, my_Mname=#{name} WHERE my_Mid=#{id}")
    public int updateMajor(Major major);

    @Delete("DELETE FROM management.may_major WHERE my_Mid=#{id}")
    public int deleteMajor(int id);
}
