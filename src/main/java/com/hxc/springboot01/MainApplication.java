package com.hxc.springboot01;

import ch.qos.logback.core.db.DBHelper;
import com.hxc.springboot01.bean.Pet;
import com.hxc.springboot01.bean.User;
import com.hxc.springboot01.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/18
 * Time: 13:17
 */


@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        // 查看组件中的容器
        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
        // 从容器中获取组件
        /**
         * 外部无论调用多少遍，返回的都是容器中的单实例
         */
        Pet pet1 = run.getBean("tom", Pet.class);
        Pet pet2 = run.getBean("tom", Pet.class);
        System.out.println("组件:" + (pet1 == pet2));

        MyConfig bean = run.getBean(MyConfig.class);
        User user  = bean.user();
        User user1 = bean.user();
        System.out.println("bean:" + (user == user1));

    }
}
