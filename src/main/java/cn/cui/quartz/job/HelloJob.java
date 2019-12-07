package cn.cui.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements org.quartz.Job {
	 @Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("我是王美佳1");
	}
}
