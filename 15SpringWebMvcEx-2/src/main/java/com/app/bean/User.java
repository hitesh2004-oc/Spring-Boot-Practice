package com.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // no need for create constructor
@AllArgsConstructor
public class User {

    private Integer userId;
    private String userName;
    private String userRole;

}
