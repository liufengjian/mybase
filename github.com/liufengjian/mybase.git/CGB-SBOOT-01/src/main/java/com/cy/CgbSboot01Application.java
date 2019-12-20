package com.cy;
/**
 * @SpringBootApplication注解描述的类为
 * springboot项目的启动类,此类在启动时会:
 * 1:基于配置文件(spring.factories)初始化自动配置
 * 2:扫描启动类所在包以及子包中的类,检查类上是否有
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CgbSboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}

}
