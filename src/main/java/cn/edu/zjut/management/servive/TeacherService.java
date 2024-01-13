package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Teacher;

import java.util.List;

public interface TeacherService {

    public Teacher selectTeacherById(int id);

    public List<Teacher> selectAllTeacher();

    public int addTeacher(Teacher teacher);

    public int updateTeacher(Teacher teacher);

    public int deleteTeacherById(int id);
}
