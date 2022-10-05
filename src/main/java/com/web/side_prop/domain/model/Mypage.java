package com.web.side_prop.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mypage {

    private String id;

    private String password;

    private String name;

    private String email;

    private String birth;
}
