package javabeginner;

import java.util.ArrayList;
import java.util.Scanner;

public class person {
	
	//INDIVIDUALS
 	
    
    
    //ATTRIBUTES
	int age;
    String name;
    
    //G&S
    public String getName() {
        return name;
    }
    
    
    public int getAge() {
        return age;
    }
    
    //CONSTRUCTOR
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    
    
    

	public void list() {
		
		
		ArrayList<person> people = new ArrayList<>(); 
		person bob= new person("Bob", 25);
	    person barbara= new person("Barbara", 34);
	    person scrumpo= new person("Scrumpo", 39);
	    person huckleberry= new person("Huckleberry", 43);
	    person kevin= new person("Kevin", 43);
	    person sara= new person("Sara", 43);
		person adam= new person("Adam", 23);
		people.add(adam);
		people.add(barbara);
		people.add(scrumpo);
		people.add(huckleberry);
		people.add(kevin);
		people.add(sara);
		people.add(bob);
		for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName()+", "+people.get(i).getAge());
        }
    }
	public void add(String name, int age) {
		ArrayList<person> people = new ArrayList<>(); 
		person bob= new person("Bob", 25);
	    person barbara= new person("Barbara", 34);
	    person scrumpo= new person("Scrumpo", 39);
	    person huckleberry= new person("Huckleberry", 43);
	    person kevin= new person("Kevin", 43);
	    person sara= new person("Sara", 43);
		person adam= new person("Adam", 23);
		people.add(adam);
		people.add(barbara);
		people.add(scrumpo);
		people.add(huckleberry);
		people.add(kevin);
		people.add(sara);
		people.add(bob);
		
		
		//NAME ENTRY
		
        //ageScan.close();
        int ageEntry = age;
        String nameEntry = name;
        //Add person to list
        person newPerson = new person(nameEntry, ageEntry);
        people.add(newPerson);
        for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName()+", "+people.get(i).getAge());
        }
		
	}
	
	
	
	
	
}

