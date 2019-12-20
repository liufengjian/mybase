package com.cy.pj.common.cache;
/**
 * @Component注解描述的类为一个spring框架管理的对象
 * @Lazy 注解描述类时,表示此类在容器启东市不创建其实例
 * 对象,这种特性成为延迟加载,但是此特性支队特定作用域的对象起作用()例如单例作用域
 * @Scope注解用于定于对象的作用域(singleton, prototype)
 * singleton保证类的实例在内存中只有一份
 * prototype 此作用域表示这个类的实例需要时创建,并且每次从容器获取都会创建一个新的实例
 * 
 */
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
@Scope("singleton")
public class DefaultCache {
	public DefaultCache() {
		System.out.println("DefaultCache()");
		
	}
	@PostConstruct//为声明周期初始化方法
		
	
	public void init() {//生命周期方法
		System.out.println("init()");
	}
	@PreDestroy//描述的方法可以再对象销毁前执行
	public void destory() {
		System.out.println("destory()");
	}
}
