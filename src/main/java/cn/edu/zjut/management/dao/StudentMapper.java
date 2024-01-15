package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    /*@Select("SELECT * FROM management.may_student WHERE my_Aid=#{id}")
    @ResultMap("selectStudent")
    public List<Student> selectStudentByAreaId(int id);*/


    @Select("SELECT * FROM management.may_student")
    @ResultMap("selectStudent")
    public List<Student> selectAllStudent();

    @Insert("INSERT INTO management.may_student VALUES (#{id},#{name},#{gender},#{age},#{area.id},#{classes.id},#{credits})")
    public int addStudent(Student student);

    @Update("UPDATE management.may_student SET my_Sid=#{id}, my_Sname=#{name},my_Sgender=#{gender},my_Sage=#{age},my_Aid=#{area.id},my_Classid=#{classes.id},my_Scredits=#{credits} WHERE my_Sid=#{id}")
    public int updateStudent(Student student);

    @Delete("DELETE FROM management.may_student WHERE my_Sid=#{id}")
    public int deleteStudentById(int id);
}
