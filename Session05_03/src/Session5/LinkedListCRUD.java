package Session5;

import java.util.*;

public class LinkedListCRUD {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		Scanner s = new Scanner(System.in);
		int choice;

		do {
			System.out.println("=================="+"\n");
			System.out.println("CRUD Demo");
			System.out.println("1.Add Elemets");
			System.out.println("2.view Elemets");
			System.out.println("3.update Elemets");
			System.out.println("4.delete Elemets");
			System.out.println("5.exit ");
			System.out.println("-----------------------------");
			System.out.println("Enter your choice : ");
			choice = s.nextInt();

			System.out.println("=================================");
			switch (choice) {
			case 1:
				System.out.println("Enter the element to add : ");
				String element = s.next();
				list.add(element);
				System.out.println("element added successfully");
				break;
			case 2:
				System.out.println("List the elements are as follows");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + " " + list.get(i));
				}
				break;

			case 3:
				System.out.println("enter the index element to update :");
				int index = s.nextInt();
				if (index >= 0 && index < list.size()) {
					System.out.println("enter the new value :");
					String newValue = s.next();
					list.set(index, newValue);
					System.out.println("Element Updated");
				} else {
					System.out.println("invalid index");
				}
				break;

			case 4:
				System.out.println("enter the index element to delete :");
				int index1 = s.nextInt();
				if (index1 >= 0 && index1 < list.size()) {
					list.remove(index1);
					System.out.println("Element deleted");
				} else {
					System.out.println("invalid index");
				}
				break;
			case 5:
				System.out.println("Exiting ....");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 5);

		s.close();
	}
}
