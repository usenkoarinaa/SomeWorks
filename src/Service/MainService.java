package Service;

import models.Person;

import java.util.Date;

import models.Child;
import models.Employee;
import models.Group;
import models.Nationality;

public class MainService {
	

	public MainService() {
		
	}

	public static void main(String[] args) {
		Child p = new Child ();
		
		System.out.println(p.toString());
		
		Child n = new Child("Arina","Usenko","081299-11145","alergies", 3, Nationality.Latvian);
		
		System.out.println(n.toString());
		
		Child m = new Child();
		
		System.out.println(m.toString());
	
		Group w = new Group ();
		
		w.addChildInGroup(p);
		w.addChildInGroup(n);
		w.addChildInGroup(m);
		w.removeChildFromGroup(p);
	
		
		System.out.println(w.toString());
		
		
		
	}

}