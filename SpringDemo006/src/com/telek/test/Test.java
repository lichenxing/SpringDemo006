/**
 * 
 */
package com.telek.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telek.service.Chinese;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("appicationContext.xml");
		Chinese c =act.getBean("chinese",Chinese.class);
		//打印出Chinese实例获得的ApplicationContext
		System.out.println(c.getContext());
		//比较两种方法获得的BeanFactory
		System.out.println(act==c.getContext());
		
		
		
		/*
		 * 实现ApplicationContextAware接口让Bean拥有了访问容器的能力，
		 * 但污染了代码，导致代码与Spring接口耦合在一起，因此，一般不要直接访问容器
		 */

	}

}
