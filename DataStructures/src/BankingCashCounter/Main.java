package BankingCashCounter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(44);
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		
		
		q.enqueue(42);
		System.out.println(q.size());
		q.show();
	}

}
