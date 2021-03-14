package com.hxc.springboot01.config;

import ch.qos.logback.core.db.DBHelper;
import com.hxc.springboot01.bean.Car;
import com.hxc.springboot01.bean.Pet;
import com.hxc.springboot01.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/18
 * Time: 14:16
 */
/**
 *
 * @Import 自动导入类中的组件
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
// @ConditionalOnBean(name = "") 条件装配
// @ImportResource("classpath:**.xml")
@EnableConfigurationProperties(Car.class) // 开启Car属性配置功能，把Car自动注册到容器中

/**
 * proxyBeanMethods = true外部无论调用多少遍，返回的都是容器中的单实例
 * proxyBeanMethods = false 每一次调用返回的对象都是不同的
 */

public class MyConfig {
    @Bean
    public User user(){
        return new User("zhangsan",18);
    }

//    @Scope("prototype")
    @Bean("tom")  // 自定义组件名
    public Pet tomcat(){
        return new Pet("tomcat");
    }
}
