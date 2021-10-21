package com.fpt.myweb.dto.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewRequest {

    private String title;

    private String decription;

    private String image;

    private Long user_id;
}
