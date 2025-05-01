package apps;

import myclasses.Order;
import myclasses.OrderStatus;

public class UsingEnum {

	public static void main(String[] args) {
		
		OrderStatus s1 = OrderStatus.DELIVERED;
		OrderStatus [] all = OrderStatus.values();
		for(OrderStatus val : all)
			System.out.println(val);
		Order o1 = new Order(1, s1);

	}

}
