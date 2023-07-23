//Question 5: Merge and Sort the elements in two Linked-List
//Description: Consider two Linked-List with N number of integers in Data-Node respectively.

//Sample input: 
//Linked-List-1:- 25->35->12->4->36->48
//Linked-List-2:- 8->32->22->45->63->49

//Output:- 4->8->12->22->25->32->35->36->45->48->49->63

//java program

import java.io.*;
import java.util.*;
public class MergeSortedLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }
    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        System.out.print("The elements of the Linked List after merging and sorting the Linked List are : ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode curr = head1;
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        while(curr.next != null) {
            l1.add(curr.data);
            curr = curr.next;
        }
        l1.add(curr.data);
        Collections.sort(l1);
        curr = head1;
        for(Integer i : l1) {
            if(curr.next != null) {
                curr.data = i;
                curr = curr.next;
            }else {
                curr.data = i;
            }
        }
         curr = head2;
         l1 = new ArrayList<Integer>();
        while(curr.next != null) {
            l1.add(curr.data);
            curr = curr.next;
        }
        l1.add(curr.data);
        Collections.sort(l1);
        curr = head2;
        for(Integer i : l1) {
            if(curr.next != null) {
                curr.data = i;
                curr = curr.next;
            }else {
                curr.data = i;
            }
        }
        SinglyLinkedListNode temp = null;
        if(head1.data < head2.data) {
            temp = head1;
            head1 = head1.next;
        }else{
            temp = head2;
            head2 = head2.next;
        }
        SinglyLinkedListNode current = temp;
        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1 == null) {
            current.next = head2;
        }else {
            current.next = head1; 
        }
        return temp;
    }
   private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int list1length;
        System.out.print("Enter the size of Linked List-1 : ");
        list1length = scanner.nextInt();
        SinglyLinkedList list1 = new SinglyLinkedList();
        System.out.print("Enter the data of the Linked List-1 : ");
        for (int i = 0; i < list1length; i++) {
            int llist1Item = scanner.nextInt();
            list1.insertNode(llist1Item);
        }
        SinglyLinkedList list2 = new SinglyLinkedList();
        System.out.print("Enter the size of Linked List-2 : ");
        int list2length = scanner.nextInt();
        System.out.print("Enter the data of the Linked List-2 : ");
        for (int i = 0; i < list2length; i++) {
            int llist2Item = scanner.nextInt();
            list2.insertNode(llist2Item);
        }
        SinglyLinkedListNode llist3 = mergeLists(list1.head, list2.head);
        printSinglyLinkedList(llist3);
        scanner.close();
    }
}
