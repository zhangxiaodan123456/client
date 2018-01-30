package org.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("org.spring.springboot.dao")
public class ClientApplication {

  public static void main(String[] args) {
      // 程序启动入口
      // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
      SpringApplication.run(ClientApplication.class,args);
  }
}