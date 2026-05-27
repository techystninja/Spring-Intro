package com.techninja.module1Introduction;

import com.techninja.module1Introduction.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	private final Map<String, NotificationService> notificationService;

	public Module1IntroductionApplication(Map<String, NotificationService> notificationService) {
		this.notificationService = notificationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (var notificationService1 : notificationService.entrySet()) {
			System.out.println(notificationService1.getKey());
			notificationService1.getValue().sendNotification("Hey There!!!");
		}
	}
}
