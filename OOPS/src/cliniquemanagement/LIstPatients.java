package cliniquemanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class LIstPatients {

	int top = 0;
	ArrayList doctors = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	public void add() {

    	Patient obj = new Patient();
    
    	
    	System.out.println("Enter name of Patient");
    	String name = scan.next();
    	obj.setName(name);
    	
    	System.out.println("Enter ID  of Patient");
        int id = scan.nextInt();
        obj.setId(id);
    	
    	System.out.println("Enter Phone number : ");
    	String mobileNumber = scan.next();
    	obj.setMobileNumber(mobileNumber);
    	
    	System.out.println("Enter availabilty of doctor");
    	String available = scan.next();
    	obj.setAvailability(available);
    	
    	doctors.add(obj);
 
    	/home/admin1/eclipse-workspace/functional programs
}
