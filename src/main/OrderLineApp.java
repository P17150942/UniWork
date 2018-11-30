package main;

import lib.OrderLine;
public class OrderLineApp {
	public static void main(String[] args) {
		OrderLine ol = new OrderLine();
		OrderLine ol2 = new OrderLine("p", 20 ,42);
		OrderLine ol3 = new OrderLine("p", 20 ,42);
		
		System.out.println(ol2.equals(ol3));
		System.out.println(ol.equals(ol3));
		System.out.println(ol);
	}



}
