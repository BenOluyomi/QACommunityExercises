package javabeginner;
import java.util.ArrayList;
import geometry.person;

public class mainPerson {
	public static void main(String[] args) {
	    person bob= new person("Bob", 25);
	    person barbara= new person("Barbara", 34);
	    person scrumpo= new person("Scrumpo", 39);
	    person huckleberry= new person("Huckleberry", 43);
	    person kevin= new person("Kevin", 43);
	    person sara= new person("Sara", 43);
	    person adam= new person("Adam", 23);
	    
	    
	    //System.out.println(bob.name+ " is "+bob.age+" years old.");
	    ArrayList<person> people = new ArrayList<>(); 
	    people.add(bob);
	    people.add(barbara);
	    people.add(scrumpo);
	    people.add(huckleberry);
	    people.add(kevin);
	    people.add(sara);
	    people.add(adam);
	    for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName()+", "+people.get(i).getAge());
        }

	}

}
