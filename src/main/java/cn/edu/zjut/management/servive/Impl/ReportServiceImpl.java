package cn.edu.zjut.management.servive.Impl;

import cn.edu.zjut.management.dao.ReportMapper;
import cn.edu.zjut.management.pojo.Report;
import cn.edu.zjut.management.servive.ReportServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportServie {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public Report selectReportById(int id) {
        return reportMapper.selectReportById(id);
    }

    @Override
    public List<Report> selectAllReport() {
        return reportMapper.selectAllReport();
    }

    @Override
    public int addReport(Report report) {
        return reportMapper.addReport(report);
    }

    @Override
    public int updateReport(Report report) {
        return reportMapper.updateReport(report);
    }

    @Override
    public int deleteReportById(int id) {
        return reportMapper.deleteReportById(id);
    }
}
