package javabeginner;
import java.util.Scanner;
import javabeginner.person;


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
	                	Scanner nameScan = new Scanner(System.in);
	                    System.out.println("Enter their name");
	                    String nameEntry = nameScan.nextLine();
	                    //nameScan.close();
	                    
	                    
	                    //AGE ENTRY
	                    Scanner ageScan = new Scanner(System.in);
	                    System.out.println("Enter their age");
	                    int ageEntry = ageScan.nextInt();
	                	person objA1 = new person(nameEntry, ageEntry); 
		                
	                	
		            	objA1.add(nameEntry, ageEntry); 
	                }
	            }
		    }
	
