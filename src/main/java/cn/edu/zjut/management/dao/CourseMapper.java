package cn.edu.zjut.management.dao;

import cn.edu.zjut.management.pojo.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Results(id = "selectCourse", value = {
            @Result(property = "id", column = "my_Cid"),
            @Result(property = "name", column = "my_Cname"),
            @Result(property = "teacher", column = "my_Tid",
                    one = @One(select = "cn.edu.zjut.management.dao.TeacherMapper.selectTeacherById")),
            @Result(property = "semesters", column = "my_Csemesters"),
            @Result(property = "hours", column = "my_Chours"),
            @Result(property = "examType", column = "my_Cexamtype"),
            @Result(property = "credits", column = "my_Ccredits"),
            @Result(property = "classes", column = "my_Classid",
                    one = @One(select = "cn.edu.zjut.management.dao.ClassesMapper.selectClassesById")),
            @Result(property = "position", column = "my_Cposition")

    })

    @Select("SELECT * FROM management.may_course WHERE my_Cid=#{id}")
    @ResultMap("selectCourse")
    public Course selectCourseById(int id);

    @Select("SELECT * FROM management.may_course")
    @ResultMap("selectCourse")
    public List<Course> selectAllCourse();

    @Insert("INSERT INTO management.may_course VALUES (#{id},#{name},#{teacher.id},#{semesters},#{hours},#{examType},#{credits},#{classes.id},#{position})")
    public int addCourse(Course course);

    @Update("UPDATE management.may_course SET my_Cid=#{id},my_Cname=#{name},my_Tid=#{teacher.id},my_Csemesters=#{semesters},my_Chours=#{hours},my_Cexamtype=#{examType},my_Ccredits=#{credits},my_Classid=#{classes.id},my_Cposition=#{position} WHERE my_Cid=#{id}")
    public int updateCourse(Course course);

    @Delete("DELETE FROM management.may_course WHERE my_Cid=#{id}")
    public int deleteCourseById(int id);
}
