package org.example.src.robertSedgewick.sort.linkedList;

public class Node {
    public String item;
    public Node next;

    public Node () {}

    public static void main(String[] args) {
        Node first = new Node();
        first.item = "to";

        Node second = new Node();
        second.item = "be";
        first.next = second;

        Node third = new Node();
        third.item = "or";
        second.next = third;
    }
}
