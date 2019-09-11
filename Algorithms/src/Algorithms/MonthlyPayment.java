package tictactoe;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int P = Integer.parseInt(args[0]);
         int Y =Integer.parseInt(args[1]);
         int R = Integer.parseInt(args[2]);
         int n = 12 * Y;
         double r = R/(12*100);
         double payment = ((P*r)/(1-Math.pow((1+r),(-1*n))));
         System.out.println(payment);
	}

}
