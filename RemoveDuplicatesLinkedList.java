//Question 6: Remove Duplicates from Linked-List
//Description: Consider a Linked-List with N number of repeated integers in Data-Node

//Sample input:
//Linked-List:- 2->5->12->2->3->5->1->2->5->5

//Output:- 2->5->12->3->1

//java program

import java.util.*;
class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}
class SinglyLinkedList {
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
class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node) {
        System.out.print("The Linked List after removing the duplicates are : ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
class Result {
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    List<Integer> s1 = new ArrayList<Integer>();
    SinglyLinkedListNode temp = llist;
    while(temp != null) {
        if(!s1.contains(temp.data))
            s1.add(temp.data);
        temp = temp.next;
    }
    temp = llist;
    for(int i = 0; i < s1.size();i++) {
        temp.data = s1.get(i);
        if(i == s1.size() - 1)
            temp.next = null;
        else
            temp = temp.next;
    }
    return llist;
    }
}
public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Linked List : ");
        int listsize = sc.nextInt();
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Enter the data of the Linked List : ");
        for(int i = 0; i < listsize;i++) {
            int dataitem = sc.nextInt();
            list.insertNode(dataitem);
        }
        SinglyLinkedListNode llist1 = Result.removeDuplicates(list.head);
        SinglyLinkedListPrintHelper.printList(llist1);
        sc.close();
    }
}
