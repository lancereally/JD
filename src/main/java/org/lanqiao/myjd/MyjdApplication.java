package org.lanqiao.myjd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.lanqiao.myjd.mapper")
@SpringBootApplication
public class MyjdApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyjdApplication.class, args);
    }

}
