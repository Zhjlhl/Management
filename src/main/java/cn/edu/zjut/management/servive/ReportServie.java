package cn.edu.zjut.management.servive;

import cn.edu.zjut.management.pojo.Report;

import java.util.List;

public interface ReportServie {
    public Report selectReportById(int id);

    public List<Report> selectAllReport();

    public int addReport(Report report);

    public int updateReport(Report report);

    public int deleteReportById(int id);
}
