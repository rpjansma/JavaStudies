package com.javatechniques.linkedList;

import com.javatechniques.linkedList.customLinkedList.CustomLinkedList;
import com.javatechniques.linkedList.customLinkedList.Node;

import java.util.LinkedList;

public class Lists {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("Pipoca");
        list.add("Sagu");
        list.add("Xablau");
        list.add("Tango");

        System.out.println(list.contains("Sagu"));
        System.out.println(list.contains("Bimboca"));

        list.removeFirst();

        list.forEach(x -> System.out.println(x + "->"));

        CustomLinkedList customLinkedList = new CustomLinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        customLinkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        customLinkedList.displayContents();
        customLinkedList.deleteBackHalf();
        customLinkedList.displayContents();


    }
}
