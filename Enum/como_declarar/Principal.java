package como_declarar;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Order order1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		//Conversão String p/ enum
		order1.setStatus(OrderStatus.valueOf("SHIPPED"));
		System.out.println(order1.toString());
		
	}

}
