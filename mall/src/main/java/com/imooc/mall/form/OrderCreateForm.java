package com.imooc.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/04
 * @Time:10:33
 */
@Data
public class OrderCreateForm {
    @NotNull
    private Integer shippingId;
}
