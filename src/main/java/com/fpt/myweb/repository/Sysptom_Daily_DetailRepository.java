package com.fpt.myweb.repository;

import com.fpt.myweb.entity.Sysptom_Daily_Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface Sysptom_Daily_DetailRepository extends JpaRepository<Sysptom_Daily_Detail,Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `fcdc_duannd`.`sysptom_daily_detail` (`id`, `daily_report_id`, `sysptom_id`) VALUES (?1, ?2, ?3);",nativeQuery = true)
    void add(Long id,Long daily_report_id,Long sysptom_id);
}