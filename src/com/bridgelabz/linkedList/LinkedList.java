package com.bridgelabz.linkedList;

public class LinkedList {

	Node head;

	class Node {
		Node ref;
		Object data;

		Node(Object data) {
			this.data = data;
		}

	}

	public void append(Object data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else if (head.ref == null) {
			head.ref = newNode;
		} else {
			Node temp = head;
			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}

	public void display() {

		if (head == null) {
			System.out.println("linked list is empty");
		} else if (head.ref == null) {
			System.out.println(head.data);

		} else {
			Node temp = head;
			while (temp != null) {
				if (temp.ref != null) {
					System.out.print(temp.data + "=>");
				} else {
					System.out.print(temp.data + "\n");

				}
				temp = temp.ref;
			}
		}
	}

	public void search(Object searchElement) {
		if (head.data == searchElement)
			System.out.println(searchElement + " is Found");
		else {
			Node temp = head;

			boolean isFound = false;

			while (temp != null) {
				if (temp.data == searchElement) {
					isFound = true;
					break;
				}

				temp = temp.ref;
			}

			if (isFound == true)
				System.out.println(searchElement + " is Found");
			else
				System.out.println(searchElement + " is not found..");
		}

	}

	public static void main(String args[]) {

		LinkedList call = new LinkedList();
		call.append(56);
		call.display();

		call.append(30);
		call.display();

		call.append(70);
		call.display();

		call.search(30);

	}

}
