package tictactoe;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
	//nt y = Integer.parseInt(args[0]);
		//t m = Integer.parseInt(args[1]);
		//d = Integer.parseInt(args[2]);
		       
		       int y0 = y - ((14 - m) / 12);
			   int	x = y0 + (y0/4) - (y0/100) +(y0/400);
			   int m0 = m + (12 * ((14 - m) / 12)) - 2;
			   int d0 = (d + x + ((31*m0) / 12)) %  7;
			   	switch(d0) 
			   	{
			   	case 0:System.out.println("sunday");
			   		break;
			   		
			   	case 1:System.out.println("monday");
		   		break;
		   		
		   		
			   	case 2:System.out.println("tuesday");
			    break;
			    
			   	case 3:System.out.println("wendsday");
			   break;
			   
			   	case 4: System.out.println("thursday");
			   	break;
			   	
			   	case 5: System.out.println("Friday");
			   	break;
		   		
			   	case 6: System.out.println("saturday");
			   	break;
		   		
			   	}
	
	}

}
