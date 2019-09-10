package OrderedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.add(5);
        list.add(3);
        list.add(10);
        list.add(7);
        list.add(12);
        list.add(1);
        list.add(4);
        list.remove(4);
        list.remove(10);
        list.remove(12);
        list.remove(1);
        list.add(8);
        list.remove(5);
        list.search(12);
        list.search(11);
        list.search(11);
        list.search(3);
        list.search(9);
        list.remove(12);
		
		list.show();
	}

}
