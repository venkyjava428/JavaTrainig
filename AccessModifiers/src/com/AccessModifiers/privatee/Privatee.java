package com.AccessModifiers.privatee;

public class Privatee {

	private String accountNumber;


	public static void main(String[] args) {
		Privatee account = new Privatee();
	        //setting value directly without setter                        
	        account.accountNumber = "123456";
	        //getting value directly without getter               
	        String actNumber = account.accountNumber;
	        System.out.println(actNumber);
		
		 
	}

}
