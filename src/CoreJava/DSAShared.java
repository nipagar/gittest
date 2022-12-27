// hellooooo
//nikita
package CoreJava;

import java.util.LinkedList;
import java.util.Scanner;

public class DSAShared {

	class group {

		String leadname;

		String members[] = new String[7];
		String grpname;

		public group(String gnm, String l) {
			this.leadname = l;
			this.grpname = gnm;
		}
	}

	static class Node {
		group data;
		Node next = null;

		Node(group g) {
			this.data = g;
		}

		Node() {

		}

		Node(group g, Node next) {
			this.data = g;
			this.next = next;
		}

	}

	LinkedList<Node> list = new LinkedList<Node>();
	Scanner scn = new Scanner(System.in);
	Node head = null;

	public void addGrp(Scanner sc) {
		// int size = 7;
		sc.nextLine(); // NOTE: Added to 'consume' the new line character left over by sc.nextInt()
		try {

			if (head == null) {
				System.out.println("enter the name of your project group");
				String groupname = scn.nextLine();
				System.out.println("Enter Group lead Name");
				String lead = sc.nextLine();
				group grp1 = new group(groupname, lead);
				System.out.println("members are");

				for (int i = 0; i < 6; i++) {
					grp1.members[i] = sc.nextLine();
				}

				Node n1 = new Node(grp1, null);

				head = n1;
				list.add(n1);

			} else {
				Node start = head;
				while (start.next != null) {

					start = start.next;
				}
				System.out.println("enter the name of your project group");
				String groupname = scn.nextLine();
				System.out.println("Enter Group lead Name");
				String lead = sc.nextLine();
				group grp1 = new group(groupname, lead);
				System.out.println("members are  ");

				for (int i = 0; i < 6; i++) {
					grp1.members[i] = sc.nextLine();
				}
				Node n1 = new Node(grp1, null);
				start.next = n1;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// Print all elements of the Array
	public void display() {
		Node start = head;
		while (start != null) {
			group g1 = start.data;
			System.out.println("Group Name = " + g1.grpname + "  Leader Name = " + g1.leadname);
			for (int i = 0; i < 6; i++) {
				System.out.println(g1.members[i]);

			}
			start = start.next;

		}
	}

	public static void main(String arg[]) {
		DSAShared ll = new DSAShared();

		int ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\n1.addGrp\n2.display1grp\n3.displayallgrps\n0.Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ll.addGrp(sc);
				break;
			case 2:
				ll.group1();
				break;
			case 3:
				ll.display();
				break;
			case 0:
				ll.exit();
				break;
			}

		} while (ch != 0);

		sc.close();

	}

	public void group1() {

		Node start = head;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the group name to be search");
		String search = sc.nextLine();

		while (start != null) {
			group g1 = start.data;
			if (g1.grpname.equals(search)) {
				System.out.println("Group Name = " + g1.grpname + "  Leader Name = " + g1.leadname);
				for (int i = 0; i < 6; i++) {
					System.out.println(g1.members[i]);

				}

				return;
			}

			else {
				start = start.next;
			}

		}
		System.out.println("Invalid Group Name/please check correctly (its case sensitive) ");
	}

	public void exit() {
		System.out.println("thanks for using the code!!!");
	}

}
