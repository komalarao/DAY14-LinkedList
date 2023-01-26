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

	public void addFirst(Object data) {

		Node newNode = new Node(data);
	       
        if(head == null)
            head=newNode;
        else
        {
            Node temp = head;
            head = newNode;
            head.ref = temp;
           
        }
	}

	public static void main(String args[]) {

		LinkedList call = new LinkedList();
		call.addFirst(70);
        call.display();
        
		call.addFirst(30);
        call.display();

		call.addFirst(56);
		call.display();

	}

}
