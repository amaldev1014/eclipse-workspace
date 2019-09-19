package datastructures;

public class Person {

	private String name;
	private double balance;
	
	
	public Person(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public String toString() {
		return "Person [name=" + name + ", balance=" + balance + "]";
	}
	
	
	public double withdraw(int amount) 
	{
		balance = balance - amount;
		return balance;
	}
	
	public double deposit(int amount) 
	{
		balance = balance + amount;
		return balance;
	}
}
