/**
 * ����Bean�࣬ʵ��ApplicationContextAware�ӿ�
 * ���ཫӵ�з�������������
 */
package com.telek.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Administrator
 *
 */
public class Chinese implements ApplicationContextAware{
	
    //��BeanFactory�����Գ�Ա��������    
	private ApplicationContext ctx;
	
	/**
	 * ʵ��ApplicationContextAware�ӿڱ���ʵ�ֵķ���
	 */
	 
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx=ctx;
	}
	
	//���ApplicationContext�Ĳ��Է���
	public ApplicationContext getContext(){
		return ctx;
	}

}
