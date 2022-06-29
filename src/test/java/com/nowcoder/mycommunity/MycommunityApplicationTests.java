package com.nowcoder.mycommunity;

import com.nowcoder.mycommunity.controller.AlphaController;
import com.nowcoder.mycommunity.dao.AlphaDao;
import com.nowcoder.mycommunity.service.AlphaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MycommunityApplication.class)
public class MycommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}


	// 测试获取Spring容器和bean
	@Test
	public void testApplicationContext() {
		System.out.println(applicationContext);
		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);
		alphaDao = applicationContext.getBean("alphaMybatis",AlphaDao.class);
		System.out.println(alphaDao.select());
	}

	@Test
	public void testBean() {
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	// 测试依赖注入
	@Autowired
	private AlphaController alphaController;
	@Test
	public void testDI() {
		System.out.println(alphaController);
		System.out.println(alphaController.find());
	}
}
