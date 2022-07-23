package com.kakase9.reggietakeout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching //开启sping Caching 缓存注解功能
public class ReggietakeoutApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReggietakeoutApplication.class, args);
        log.info("项目启动成功...");
    }

}
