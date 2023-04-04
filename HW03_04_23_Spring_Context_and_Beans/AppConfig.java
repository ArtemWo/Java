package org.example.HW03_04_23_Spring_Context_and_Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig{

	@Bean
	public Order order() {
		//Order order = new Order("BMW",59000);   //С применением java-конфигурации и @Autowired
		Order order = new Order();               //С применением xml конфигурации
		return order;
	}

	public PaymentGateway paymentGateway(){
		PaymentGateway paymentGateway =new PaymentGateway();
		paymentGateway.setOrder(order());
		return paymentGateway;
	}

}
