package org.example.src.robertSedgewick.sort.linkedList;

public class Node {
    public String item;
    public Node next;

    public Node () {}

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Node first = new Node();
        first.item = "to";
        Node second = new Node();
        second.item = "be";
        first.next = second;
        Node last = new Node();
        last.item = "or";
        second.next = last;

        System.out.println(first.item);
        System.out.println(first.next.item);

        //insert at the beginning
        Node oldFirst = first;
        first = new Node();
        first.item = "not";
        first.next = oldFirst;
        System.out.println("======insert at the beginning=======");
        System.out.println(first.item);
        System.out.println(first.next.item);

        //delete at the beginning
        first = first.next;
        System.out.println("=====delete at the beginning=======");
        System.out.println(first.item);
        System.out.println(first.next.item);

        //append from the end
        Node oldLast = last;
        Node newLast = new Node();
        newLast.item = "not";
        oldLast.next = newLast;
        System.out.println("=====append from the end=======");
        System.out.println(newLast.item);
        System.out.println(newLast.next);



    }
}
