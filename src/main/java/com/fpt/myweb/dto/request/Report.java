package com.fpt.myweb.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    private Long userId;
    private Date dateReport;
    private List<Long> listSysptomId;
    private List<Long> listMedicineId;
    private List<Long> listExerciseId;
    private Float temperature;
    private Float spo2;



}
