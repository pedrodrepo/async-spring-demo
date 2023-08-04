package com.pedrorodrepo.demoasync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@Configuration
public class AsyncConfiguration {

	@Bean(name = "propertyAsyncExecutor01")
	public Executor getFirstAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(50);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("async-executor-01-");
		executor.initialize();
		return executor;
	}

	@Bean(name = "propertyAsyncExecutor02")
	public Executor getSecordAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(50);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("async-executor-02-");
		executor.initialize();
		return executor;
	}
}
