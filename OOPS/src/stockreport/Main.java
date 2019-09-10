package stockreport;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of stocks: ");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Stocks stock = new Stocks();
		stock.createNStocks(n);
		 System.out.println("Enter stock name, number of shares and price : ");
		 for(int i=0;i<n;i++) {
		String name = scan.next();
	    int num = scan.nextInt();
	    double price = scan.nextDouble();
	    Stock one = new Stock(name,num,price);
	   
		stock.addStocks(one);
		 }
		 System.out.println(stock.stocks[0].stockValues());
		 System.out.println(stock.stocks[1].stockValues());
		 
		
		
	}

}
