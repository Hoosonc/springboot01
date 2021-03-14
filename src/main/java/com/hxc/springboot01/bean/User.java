package com.hxc.springboot01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/18
 * Time: 14:13
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;

}
