package com.fpt.myweb.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserRequet {

    private String name;

    private String password;

    private String gender;

    private Date startOfDate;

    private String email;

    private String phone;

    private String address;

    private Date birthOfdate;

    private long role_id;

    private long village_id;

}
