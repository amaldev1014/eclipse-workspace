package cliniquemanagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ListDoctors {

	
	int top = 0;
	ArrayList doctors = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	public void add() {

    	Doctor obj = new Doctor();
    
    	
    	System.out.println("Enter name of doctor");
    	String name = scan.next();
    	obj.setName(name);
    	
    	System.out.println("Enter ID  of doctor");
        int id = scan.nextInt();
        obj.setId(id);
    	
    	System.out.println("Enter Specialization : ");
    	String special = scan.next();
    	obj.setSpecialization(special);
    	
    	System.out.println("Enter availabilty of doctor");
    	String available = scan.next();
    	obj.setAvailability(available);
    	
    	doctors.add(obj);
    	
    	
    	
    
	}
}
