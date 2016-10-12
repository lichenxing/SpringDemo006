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
		//��ӡ��Chineseʵ����õ�ApplicationContext
		System.out.println(c.getContext());
		//�Ƚ����ַ�����õ�BeanFactory
		System.out.println(act==c.getContext());
		
		
		
		/*
		 * ʵ��ApplicationContextAware�ӿ���Beanӵ���˷���������������
		 * ����Ⱦ�˴��룬���´�����Spring�ӿ������һ����ˣ�һ�㲻Ҫֱ�ӷ�������
		 */

	}

}
