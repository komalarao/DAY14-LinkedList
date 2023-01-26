package com.bridgelabz.linkedList;
import java.util.Scanner;

public class LinkedList {

	Node head;

	class Node {
		Node ref;
		int data;

		Node(int data) {
			this.data = data;
		}

	}

	public void append(int data) {

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

	public void search(int searchElement) {
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
 void push_at( int position,int data) {  
		
	    Node newNode = new Node(data); 
	    newNode.ref = null;

	    if(position < 1) {
	      System.out.print("\nposition should be >= 1.");
	    } else if (position == 1) {
	      newNode.ref = head;
	      head = newNode;
	    } else {
	      
	      Node temp = new Node(data);
	      temp = head;
	      for(int i = 1; i < position-1; i++) {
	        if(temp != null) {
	          temp = temp.ref;
	        }
	      }
	   
	      if(temp != null) {
	        newNode.ref = temp.ref;
	        temp.ref = newNode;  
	      } else {
	        System.out.print("\nThe previous node is null.");
	      }       
	    }
 }
 public void sortList() {

		Node currNode = head, index = null;

		int temp;

		if (head == null) {
			return;
		} else {
			while (currNode != null) {
				index = currNode.ref;

				while (index != null) {
					if (currNode.data >index.data) {
						temp = currNode.data;
						currNode.data = index.data;
						index.data = temp;
					}

					index = index.ref;
				}
				currNode = currNode.ref;
			}
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
		
		call.push_at(3,40);
		call.display();
		
		call.search(40);
		
		call.sortList();
        call.display();

	}

}
