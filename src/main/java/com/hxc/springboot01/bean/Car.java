package com.hxc.springboot01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/18
 * Time: 15:47
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String name;
    private String price;

}
