package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jdx
 * @create 2020-6-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {  //<T> 表示通用

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
