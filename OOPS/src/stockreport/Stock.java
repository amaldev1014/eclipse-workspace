package stockreport;

public class Stock {

	private String stockName;
	private int numberOfShare;
	private double sharePrice;
	
	
	
	public Stock(String stockName, int numberOfShare, double sharePrice) {
		super();
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	}
	
	
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	public double stockValues() 
	{
		double stockValue = this.getNumberOfShare()*this.getSharePrice();
		return stockValue;
	}
	
	
}
