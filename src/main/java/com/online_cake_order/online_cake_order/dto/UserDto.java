package com.online_cake_order.online_cake_order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

//Either getter setter or write @Data which creates both
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    // These attributes must be of same case in Postman
    private Integer id;
    @NotNull
    private String fullName;
    @NotNull
    private String email;
    @NotNull
    private String mobileNo;
    @NotNull
    private String password;
}
