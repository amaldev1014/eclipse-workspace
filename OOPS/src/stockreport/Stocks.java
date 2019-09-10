package stockreport;

import java.util.ArrayList;

public class Stocks {
    Stock[] stocks;
	double sum = 0;
	int index = -1;
	public void createNStocks(int n) {
	 stocks = new Stock[n];
	}
	
	public void addStocks(Stock stock) 
	{
		index++;
		stocks[index] = stock;
	}
	
	public void removeStock(Stock stock) 
	{
		stocks[index] = null;
		index--;
	}
	
	public void totalStockValues()
	{
		for(int i=0;i<stocks.length;i++) 
		{
			sum = sum + (stocks[i].stockValues());
		}
	}
	
	
}
