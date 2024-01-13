package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Major;

import java.util.List;

public interface MajorService {

    public Major selectMajorById(int id);

    public List<Major> selectAllMajor();

    public int addMajor(Major major);

    public int updateMajor(Major major);

    public int deleteMajor(int id);
}
