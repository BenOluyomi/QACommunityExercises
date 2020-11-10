package com.qa.qacommunity;

import classes.Wild;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		
		Wild cat = new Wild(true, 4, "Fido",true);
		
		System.out.println("The animal name is "+cat.getName()+", is it a land animal?: "+cat.getPlace()+", number of legs is: "+cat.getLeg()+" is dangerous? :"+cat.getDanger());
		
		
		
		
	}
}
