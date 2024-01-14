package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {



    @Select("SELECT * FROM management.may_teacher WHERE my_Tid=#{id}")
    @Results(id = "selectTeacher", value = {
            @Result(property = "id", column = "my_Tid"),
            @Result(property = "name", column = "my_Tname"),
            @Result(property = "gender", column = "my_Tgender"),
            @Result(property = "position", column = "my_Tposition"),
            @Result(property = "phone", column = "my_Tphone")
    })
    public Teacher selectTeacherById(int id);

    @Select("SELECT * FROM management.may_teacher")
    @ResultMap("selectTeacher")
    public List<Teacher> selectAllTeacher();

    @Insert("INSERT INTO management.may_teacher VALUES (#{id},#{name},#{gender},#{age},#{position},#{phone})")
    public int addTeacher(Teacher teacher);

    @Update("UPDATE management.may_teacher SET my_Tid=#{id},my_Tname=#{name},my_Tgender=#{gender},my_Tage=#{age},my_Tposition=#{position},my_Tphone=#{phone} WHERE my_Tid=#{id}")
    public int updateTeacher(Teacher teacher);

    @Delete("DELETE FROM management.may_teacher WHERE my_Tid=#{id}")
    public int deleteTeacherById(int id);
}
