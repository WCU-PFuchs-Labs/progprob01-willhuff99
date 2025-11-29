/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.

Will Huff
*/

import java.util.*;

public class homework20_1 {
   public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      LinkedList myList = new LinkedList();


      for (int i = 0; i < 5; i++) {
         int myInt = myScanner.nextInt();
         Sorted(myList, myInt);
      }

   
      deleteDuplicates(myList);


      System.out.println(myList);

      myScanner.close();
   }

   // Insert value into the linked list in sorted order (ascending)
   public static void Sorted(LinkedList myList, int value) {
      ListNode myNode = new ListNode(value);

      // insert at head if list is empty or value is smallest
      if (myList.head == null || value < myList.head.value) {
         myNode.next = myList.head;
         myList.head = myNode;
         return;
      }

      // otherwise, find the correct spot
      ListNode current = myList.head;
      while (current.next != null && current.next.value <= value) {
         current = current.next;
      }

      // insert after current
      myNode.next = current.next;
      current.next = myNode;
   }

   // Remove duplicate values from a sorted linked list
   // (keep a single node for each value)
   public static void deleteDuplicates(LinkedList llist) {
      if (llist.head == null) return;

      ListNode current = llist.head;

      while (current != null && current.next != null) {
         if (current.value == current.next.value) {
            // skip the duplicate node
            current.next = current.next.next;
         } else {
            current = current.next;
         }
      }
   }
}

class ListNode {
   int value;
   ListNode next;
   ListNode(int v) { value = v; }
}

class LinkedList {
   ListNode head;
   public String toString() {
      String nodeData = "";
      ListNode ref = head;
      while (ref != null) {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->" + nodeData + "null";
   }
}

