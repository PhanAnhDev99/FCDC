package com.fpt.myweb.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Daily_Report")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Daily_Report extends BaseEntity{

    @Column(name = "note")
    private String note;
    @Column(name = "dateTime")
    private Date dateTime;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "temperature")
    private Float temperature;
    @Column(name = "spo2")
    private Float spo2;
    @Column(name = "status")
    private String status;

}
