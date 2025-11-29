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

import java.util.*
public class homework20_1{
   public static void main(String[] args){
      Scanner myScanner = new Scanner(System.in);
      LinkedList myList = new LinkedList();

      for (int i = 1; i < 5; i++){
         int myInt = myScanner.nextInt();
         Sorted(myList, myInt);
      }
      deleteDuplicates(myList);
      
   }

   public static void Sorted(LinkedList myList, myInt value){
      ListNode myNode = new ListNode (value);

      if (myList.head == null || value < myList.head.value) {
         myNode.next = myList.head
            myList.head = myNode;
            return;
      }
      
      
   }
   public static void deleteDuplicates(LinkedList llist){
      
      
   }

}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
