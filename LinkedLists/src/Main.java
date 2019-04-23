import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee marySmith = new Employee("Mary","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",3245);
		Employee johnAdams = new Employee("John","Adams",4568);
		
		
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		System.out.println(list.isEmpty());
		
		list.addToFront(janeJones);
		list.addToFront(johnAdams);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		System.out.println(list.getSize());
		
		list.printList();
		
		list.removeFromFront();
		System.out.println(list.getSize());
		
		list.printList();
		
	}

}
