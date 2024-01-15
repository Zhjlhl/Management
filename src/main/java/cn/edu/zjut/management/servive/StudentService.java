package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Area;
import cn.edu.zjut.management.pojo.Report;
import cn.edu.zjut.management.pojo.Student;

import java.util.List;

public interface StudentService {


    public Student selectStudentById(int id);

    public List<Student> selectAllStudent();

    public int addStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudentById(int id);

    public List<Report> selectReportByStudentId(int id);
}
