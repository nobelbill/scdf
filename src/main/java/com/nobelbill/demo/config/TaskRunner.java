package com.nobelbill.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableTask
public class TaskRunner implements CommandLineRunner , TaskExecutionListener {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner...");
        System.out.println("f4 feature");
        System.out.println("f1 feature");
    }

    @Override
    public void onTaskStartup(TaskExecution taskExecution) {

    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {

    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {

    }
}
