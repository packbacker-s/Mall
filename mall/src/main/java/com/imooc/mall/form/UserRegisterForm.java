package com.imooc.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/06/07
 * @Time:16:10
 */
@Data
public class UserRegisterForm {

    @NotBlank(message = "用户名不能为空")//用于 String 判断空格  不能为空白
    //@NotNull
    //@NotEmpty  用于集合
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;

}
