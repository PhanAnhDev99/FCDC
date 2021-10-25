package com.fpt.myweb.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "birthOfdate")
    private Date birthOfdate;

    @Column(name = "startOfdatedate")
    private Date startOfdatedate;


    // Role
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roles; // chỗ ni trung với mapby bên User
     //Dia chi (village)
    @ManyToOne
    @JoinColumn(name = "village_id")
    private Village village;
    // new
    @OneToMany(mappedBy = "user")
    private List<New> news = new ArrayList<>();
    // daily_report
    @OneToMany(mappedBy = "user")
    private List<Daily_Report> daily_reports = new ArrayList<>();





}
