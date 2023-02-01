package com.lao.javalearning;

public class CollectAmount {
	
	public Integer  CollectAmount= 10000;
	
	public Integer CollectAmountGiveIttome() {
		
		System.out.println("dady have collected rupees" + CollectAmount +"and sent to you");
		return CollectAmount;
		
	}
	
	public static void main(String[]args) {
		
		CollectAmount myson = new CollectAmount();
		Integer amount= myson.CollectAmountGiveIttome();
		
			System.out.println("got the amount son" + amount);
		
	}

}
