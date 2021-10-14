package com.fpt.myweb.controller;

import com.fpt.myweb.dto.Report;
import com.fpt.myweb.entity.Daily_Report;
import com.fpt.myweb.entity.Sysptom_Daily_Detail;
import com.fpt.myweb.entity.User;
import com.fpt.myweb.repository.Daily_ReportRepository;
import com.fpt.myweb.repository.Sysptom_Daily_DetailRepository;
import com.fpt.myweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reportController {
    @Autowired
    private Daily_ReportRepository daily_reportRepository;
    @Autowired
    private Sysptom_Daily_DetailRepository sysptom_daily_detailRepository;
    @Autowired
    private UserRepository userRepository;
    @PostMapping(value = "/addReport")
    public ResponseEntity<?> addReport(@RequestBody Report report){
        Daily_Report daily_report = new Daily_Report();
        User user = userRepository.findById(report.getUserId()).orElse(null);
        daily_report.setUser(user);
        daily_report.setDateTime(report.getDateReport());
        daily_reportRepository.save(daily_report);

        for(int i = 0; i< report.getListSysptomId().size();i++){
            Sysptom_Daily_Detail sysptom_daily_detail = new Sysptom_Daily_Detail();
            sysptom_daily_detailRepository.add(sysptom_daily_detail.getId(),daily_report.getId(),report.getListSysptomId().get(i));
        }
        return ResponseEntity.ok(daily_report);

    }

}
