package javabeginner;
import java.util.Scanner;



public class mainPerson {
	public static void main(String[] args) {
	        //SCANNING
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Enter 1 to retrieve list information, enter 2 to add a new person to the list.");
	            
	            int choice = scan.nextInt();
	            //scan.close();
	            if(choice == 1) {
	            	person objA = new person(null, choice); 
	                
	
	            	objA.list();
	            	
	                } else if(choice ==2) {
	                	person objA1 = new person(null, choice); 
		                
	                	
		            	objA1.add();
	                }
	            }
		    }
	
