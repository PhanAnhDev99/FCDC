package com.fpt.myweb.repository;

import com.fpt.myweb.entity.New;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository<New,Long> {
}
