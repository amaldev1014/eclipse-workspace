package observerdesignpattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Channel youtube = new Channel();
		Subscriber amal = new Subscriber("amaldev");
		Subscriber sabu = new Subscriber("sabu c joy");
		Subscriber tintu = new Subscriber("TintuMon");
		youtube.register(amal);
		youtube.register(sabu);
		youtube.register(tintu);
		youtube.unRegister(amal);
		youtube.unRegister(tintu);
		youtube.notifyAllSubscriber("I started a new channel in youtube");
		//youtube.showSubscribers();
	}

}
