package com.farhad.composite;

/*Main Method: Calls composite and leaf classes through abstract class Employee*/

public class Client {

	public static void main(String args[]) {

		Employee ceo = new CEO(100001, "Farhad Nasimi", "CEO", 300000.00);

		Employee executive = new HeadSales(10002, "George Lee", "Branch Executive", 40000);

		Employee headSales = new HeadSales(10052, "Tom Koerber", "Head of Sales", 30000);

		Employee headMarketing = new HeadMarketing(10012, "John Doe", "Head of Marketing", 30000);

		Employee clerk1 = new Clerk(16543, "Smith Woo", "Clerk", 10000);

		Employee clerk2 = new Clerk(15643, "Mark Zack", "Clerk", 10000);

		ceo.add(executive);

		executive.add(headSales);
		executive.add(headMarketing);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		ceo.display();
	}
}
