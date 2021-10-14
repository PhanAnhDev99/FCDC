package com.fpt.myweb.repository;

import com.fpt.myweb.entity.Sysptom_Daily_Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Sysptom_Daily_DetailRepository extends JpaRepository<Sysptom_Daily_Detail,Long> {
    @Query(value = "INSERT INTO `fcdc2`.`sysptom_daily_detail` (`id`, `daily_report_id`, `sysptom_id`) VALUES (?1, ?2, ?3);",nativeQuery = true)
    void add(Long id,Long dailyreport_id,Long sysId);
}
