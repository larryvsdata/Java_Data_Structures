import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("John","Doe",4568);
		Employee marySmith = new Employee("Mary","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		
		Employee billEnd = new Employee("Bill","End",3775);
		list.addToEnd(billEnd);
		
		list.printList();
		System.out.println(list.getSize());
		
		list.removeFromFront();
		System.out.println(list.getSize());
		
		list.removeFromEnd();
		System.out.println(list.getSize());
		
		
	}

}
