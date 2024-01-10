package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM management.may_student WHERE my_Sid=#{id}")
    @Results(id = "selectStudent", value = {
            @Result(property = "id", column = "my_Sid"),
            @Result(property = "name", column = "my_Sname"),
            @Result(property = "gender", column = "my_Sgender"),
            @Result(property = "age", column = "my_Sage"),
            @Result(property = "credits", column = "my_Scredits"),
            @Result(property = "area", column = "my_Aid",
                    one = @One(select = "cn.edu.zjut.management.dao.AreaMapper.selectAreaById")),
            @Result(property = "classes", column = "my_Classid",
                    one = @One(select = "cn.edu.zjut.management.dao.ClassesMapper.selectClassesById"))
    })
    public Student selectStudentById(int id);

}
