package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.MajorMapper;
import cn.edu.zjut.management.pojo.Major;
import cn.edu.zjut.management.servive.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;


    @Override
    public Major selectMajorById(int id) {
        return majorMapper.selectMajorById(id);
    }

    @Override
    public List<Major> selectAllMajor() {
        return majorMapper.selectAllMajor();
    }

    @Override
    public int addMajor(Major major) {
        return majorMapper.addMajor(major);
    }

    @Override
    public int updateMajor(Major major) {
        return majorMapper.updateMajor(major);
    }

    @Override
    public int deleteMajor(int id) {
        return majorMapper.deleteMajor(id);
    }
}
