package com.xulingjue.traffictestserver.quartz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class OrderNoRefact extends QuartzJobBean {
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String reTime = format.format(new Date());
		System.out.println("当前时间："+reTime);

	}
}