package org.example.HW03_04_23_Spring_Context_and_Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String[] args) {
        //С применением xml конфигурации
		ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContex.xml");
		Order order1 = (Order) context1.getBean("order");
		System.out.println(order1);
/*18:49:38.711 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext -- Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@43a25848
18:49:39.151 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader -- Loaded 2 bean definitions from class path resource [applicationContex.xml]
18:49:39.220 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'order'
18:49:39.363 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'paymentGateway'
Order(item=Car, price=40000)    //С применением xml конфигурации */


		////С применением java-конфигурации и @Autowired
//		ConfigurableApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
//        PaymentGateway paymentGateway = context2.getBean(PaymentGateway.class);
//		System.out.println(paymentGateway);

		/*18:47:45.877 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext -- Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@4c203ea1
18:47:45.914 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
18:47:46.048 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner -- Identified candidate component class: file [C:\Users\orcaw\IdeaProjects\demo\target\classes\com\example\demo\PaymentGateway.class]
18:47:46.361 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
18:47:46.365 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
18:47:46.367 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
18:47:46.370 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
18:47:46.387 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'appConfig'
18:47:46.399 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'paymentGateway'
18:47:46.418 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory -- Creating shared instance of singleton bean 'order'
ordering BMW | price: 59000  //С применением java-конфигурации и @Autowired */

	}
}
