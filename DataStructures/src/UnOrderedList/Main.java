package UnOrderedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.add("amal");
		list.add("sabu");
		list.add("kiran");
		list.add("sree");
		list.search("sree");
		list.search("kiran");
		list.search("manu");
		list.search("bibin");
		list.remove("amal");
		list.remove("sabu");
		
		list.show();
	}

}
