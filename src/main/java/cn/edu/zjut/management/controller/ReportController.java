package cn.edu.zjut.management.controller;

import cn.edu.zjut.management.pojo.Report;
import cn.edu.zjut.management.servive.ReportServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportController {
    @Autowired
    private ReportServie reportServie;

    @RequestMapping("/selectReportById")
    public Report selectReportById(@RequestParam("id") int id) {
        return reportServie.selectReportById(id);
    }

    @RequestMapping("/selectAllReport")
    public List<Report> selectAllReport() {
        return reportServie.selectAllReport();
    }

    @PostMapping(value = "/addReport")
    public int addReport(@RequestBody Report report) {
        return reportServie.addReport(report);
    }
    @PutMapping("/updateReport")
    public int updateReport(@RequestBody Report report) {
        return reportServie.updateReport(report);
    }

    @DeleteMapping("/deleteReportById")
    public int deleteReportById(@RequestParam int id) {
        return reportServie.deleteReportById(id);
    }



}
