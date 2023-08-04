package com.pedrorodrepo.demoasync.service;

import com.pedrorodrepo.demoasync.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static java.lang.Thread.sleep;

@Service
public class DemoService {

	private static final Logger logger = LoggerFactory.getLogger(DemoService.class.getSimpleName());

	@Async("propertyAsyncExecutor02")
	public void saveUser(UserModel usermodel) {
		logger.info("start");

		longSaveRunning();

		logger.info("done");
	}


	public void longSaveRunning() {
		try {
			logger.info("wait 10 seconds, thread: " + Thread.currentThread().getName());
			sleep(10000);
			logger.info("10 seconds has gone");
		} catch (InterruptedException e1) {
			logger.error("interrupted-exception: ", e1);
		}
	}
}
