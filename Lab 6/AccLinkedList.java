/* ************************
*    Alex Helfrich        *
*    Comp 1302-04         *
*    AccLinkedList Class  *
*    Lab 6                *
************************ */

public class AccLinkedList {
	private Account head = null;
	private int count = 0;
	
	public AccLinkedList() {} 
	
	public void addItemBalance(Account a) {
		if (count == 0) {
			head = a;
		} else {
			if (count == 1) {
				if (a.getBalance() < head.getBalance()) {
					head.next = a;
				} else {
					a.next = head;
					head = a;
				} //.
			} else {
				if (a.getBalance() > head.getBalance()) {
					a.next = head;
					head = a;
				} else {
					Account previous = head;
					Account current = head.next;
					try {
						while (!((a.getBalance() < previous.getBalance()) 
							  && (a.getBalance() > current.getBalance())) ) {
								  previous = current;
								  current = current.next;
							  }
							a.next = current;
							previous.next = a;
					} catch (Exception nre) {
						previous.next = a;
					}
				}
				
			}
		}
		count++; 
	}
	
	public void display() {
		Account item = head;
		System.out.printf("No. of Items in List: " + count + "\n");
		while (item != null) {
			item.display();
			item = item.next;
		}
	}
	
	public static void main(String args[]) {
		Account ac1 = new Account(832, "George Thompson", 22000.00);
		Account ac2 = new Account(922, "Sam Charles", 1338.42);
		Account ac3 = new Account(1821, "Chester Chest", 8836.96);
		Account ac4 = new Account(1857, "Sarah Stark", 32000.01);
		Account ac5 = new Account(2201, "Amy Waterson", 100.01);
		
		AccLinkedList list1 = new AccLinkedList();
		
		list1.addItemBalance(ac1);
		list1.addItemBalance(ac2);
		list1.addItemBalance(ac3);
		list1.addItemBalance(ac4);
		list1.addItemBalance(ac5);
		
		list1.display();
	}
}