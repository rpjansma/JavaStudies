package com.javatechniques.linkedList.customLinkedList;

public class CustomLinkedList {

    public Node head;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf() {

        if(head == null || head.next == null) {
            head = null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
    }
}
