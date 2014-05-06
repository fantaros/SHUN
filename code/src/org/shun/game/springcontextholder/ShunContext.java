package org.shun.game.springcontextholder;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ShunContext implements ApplicationContextAware {
	private static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		ShunContext.applicationContext = applicationContext;
	}

	/**
	 * ȡ�ô洢�ھ�̬�����е�ApplicationContext.
	 */
	public static ApplicationContext getApplicationContext() {
		checkApplicationContext();
		return applicationContext;
	}

	/**
	 * �Ӿ�̬����ApplicationContext��ȡ��Bean, �Զ�ת��Ϊ����ֵ���������.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		checkApplicationContext();
		return (T) applicationContext.getBean(name);
	}

	/**
	 * �Ӿ�̬����ApplicationContext��ȡ��Bean, �Զ�ת��Ϊ����ֵ���������.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		checkApplicationContext();
		return (T) applicationContext.getBeansOfType(clazz);
	}

	/**
	 * ���applicationContext��̬����.
	 */
	public static void cleanApplicationContext() {
		applicationContext = null;
	}

	private static void checkApplicationContext() {
		if (applicationContext == null) {
			throw new IllegalStateException(
					"applicaitonContextδע��,����applicationContext.xml�ж���SpringContextHolder");
		}
	}

}
