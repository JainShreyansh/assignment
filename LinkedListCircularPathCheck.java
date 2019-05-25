package test;

import java.util.Scanner;

public class LinkedListCircularPathCheck {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to check circular path in linked list */
	boolean checkCircularPath() {
		Node slow_ptr = head;
		Node fast_ptr = null;
		if (head != null) {
			while (slow_ptr != null) {
				fast_ptr = slow_ptr.next;
				int count = 0;
				while (fast_ptr != null) {
					if ((fast_ptr.data - slow_ptr.data) == (count+1)) {
						fast_ptr = fast_ptr.next;
						count++;
					} else if (count > 0 && (slow_ptr.data == fast_ptr.data)) {
						System.out.println("Path Exists from: "+slow_ptr.data+" to: "+fast_ptr.data+" and length is: "+(count+2));
						return true;
						
					}
					else {
						break;
					}
				}
				slow_ptr = slow_ptr.next;
			}
		}
		return false;
	}

	public void push(int new_data) {
		Node p = head;
		if (p != null) {
			while (p.next != null) {
				p = p.next;
			}
			Node n = new Node(new_data);
			n.next = null;
			p.next = n;
		} else {
			head = new Node(new_data);
		}
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		LinkedListCircularPathCheck llist = new LinkedListCircularPathCheck();
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter length of Linked list:");
		int n = reader.nextInt();

		if (n > 0) {
			System.out.println("Enter " + n + " numbers to add to the list:");

			for (int i = n; i > 0; --i) {
				int x = reader.nextInt();
				llist.push(x);
			}
			llist.printList();
			if (llist.checkCircularPath()) {
				System.out.println("Circular Path Exists!");
			} else {
				System.out.println("Circular Path doesn't Exist!");
			}
		}
		reader.close();
	}
}
