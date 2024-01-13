package cn.edu.zjut.management.dao;


import cn.edu.zjut.management.pojo.Report;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReportMapper {



    @Select("SELECT * FROM management.may_report WHERE my_id=#{id}")
    @Results(id = "selectReport", value = {
            @Result(property = "id", column = "my_id"),
            @Result(property = "student", column = "my_Sid",
                    one = @One(select = "cn.edu.zjut.management.dao.StudentMapper.selectStudentById")),
            @Result(property = "course", column = "my_Cid",
                    one = @One(select = "cn.edu.zjut.management.dao.CourseMapper.selectCourseById")),
            @Result(property = "teacher", column = "my_Tid",
                    one = @One(select = "cn.edu.zjut.management.dao.TeacherMapper.selectTeacherById")),
            @Result(property = "score", column = "my_Rscore")
    })
    public Report selectReportById(int id);

    @Select("SELECT * FROM management.may_report")
    @ResultMap("selectReport")
    public List<Report> selectAllReport();

    @Insert("INSERT INTO management.may_report VALUES (#{student.id},#{course.id},#{teacher.id},#{score},#{id})")
    public int addReport(Report report);

    @Update("UPDATE management.may_report SET my_id=#{id},my_Sid=#{student.id},my_Cid=#{course.id},my_Tid=#{teacher.id},my_Rscore=#{score} WHERE my_id=#{id}")
    public int updateReport(Report report);

    @Delete("DELETE FROM management.may_report WHERE my_id=#{id}")
    public int deleteReportById(int id);
}
