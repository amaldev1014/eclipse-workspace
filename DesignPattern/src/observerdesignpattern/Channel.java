package observerdesignpattern;

import java.util.ArrayList;

public class Channel {

	ArrayList<Subscriber> list = new ArrayList<Subscriber>();
	
	public void register(Subscriber subscriber) 
	{
		list.add(subscriber);
	}
	
	public void unRegister(Subscriber subscriber) 
	{
		list.remove(subscriber);
	}
	
	public void notifyAllSubscriber(String message) 
	{
		for(Subscriber sub : list) 
		{
			sub.update(message);
		}
	}
	
	public void showSubscribers() 
	{
		for(Subscriber sub : list) 
		{
			System.out.println(sub.getName());
			
		}
	}
	
	
}
