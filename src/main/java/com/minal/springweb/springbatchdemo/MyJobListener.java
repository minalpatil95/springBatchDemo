package com.minal.springweb.springbatchdemo;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        //JobExecutionListener.super.beforeJob(jobExecution);
        System.out.println("Job Started");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        //JobExecutionListener.super.afterJob(jobExecution);
        System.out.println("Job Ended " + jobExecution.getStatus().toString());
    }
}
