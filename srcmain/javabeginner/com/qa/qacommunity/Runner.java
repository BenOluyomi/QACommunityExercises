package com.qa.qacommunity;

import classes.Wild;

public class Runner {
	public static void main(String[] args) {
		
		Wild dog = new Wild(true, 4, "Fido","Loud Bark",false);
		
		
		System.out.println("The animal name is "+dog.getName()+", is it a land animal?: "+dog.getPlace()+", number of legs is: "+dog.getLeg()+" it has a :"+dog.getNoise()+" is dangerous? :"+dog.getDanger());
		
		
	}
}
