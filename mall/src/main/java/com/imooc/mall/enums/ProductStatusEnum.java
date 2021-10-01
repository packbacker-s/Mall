package com.imooc.mall.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {

    ON_SALE(1),//在售
    OFF_SALE(2),//下架
    DELETE(3),//删除
    ;
    Integer code;

    ProductStatusEnum(Integer code) {
        this.code = code;
    }
}
