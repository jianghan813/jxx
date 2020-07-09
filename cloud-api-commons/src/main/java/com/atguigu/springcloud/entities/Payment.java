package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jdx
 * @date 2020-06-17 09:46
 */
@Data
@AllArgsConstructor  //全参构造函数
@NoArgsConstructor   //无参构造函数
public class Payment implements Serializable {  //序列化 分布式部署可能会用得到

    private Long id;
    private String serial;

}
