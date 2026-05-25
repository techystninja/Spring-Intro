package com.techninja.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	@Autowired
	private PaymentService paymentService1;

	@Autowired
	private PaymentService paymentService2;

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);

		//this is a normal Java Object which is not managed by Spring IOC COntainer.
		PaymentService paymentService = new PaymentService();
		paymentService.pay();
	}

	@Override
	public void run(String... args) throws Exception {
		paymentService1.pay();
		paymentService2.pay();
		System.out.println(paymentService1.hashCode());
		System.out.println(paymentService2.hashCode());

	}
}
