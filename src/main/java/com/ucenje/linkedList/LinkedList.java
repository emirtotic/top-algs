package com.ucenje.linkedList;

public class LinkedList {

    private Node head;

    public void dodaj(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void obrisi(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }



    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



}
