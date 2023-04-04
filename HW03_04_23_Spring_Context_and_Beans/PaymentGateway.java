package org.example.HW03_04_23_Spring_Context_and_Beans;



import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration
@Component
@Getter
@Setter

public class PaymentGateway {
    @Autowired
		private Order order;
		@Override
		public String toString(){
			return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
		}
	}
