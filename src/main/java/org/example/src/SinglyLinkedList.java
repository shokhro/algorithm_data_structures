package org.example.src;

public class SinglyLinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public void addFirst(T value) {
        addFirst(new Node<T>(value));
    }

    private void addFirst(Node<T> node) {
        Node<T> tmp = head;
        head = node;
        head.setNext(tmp);
        count++;

        if (count == 1) {
            tail = head;
        }
    }

    public void addLast(T value) {
        addLast(new Node<T>(value));
    }

    private void addLast(Node<T> node) {
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }

        tail = node;
        count++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        head = head.getNext();
        if (count == 1) {
            tail = null;
        }

        count--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        if (count == 1) {
            head = tail = null;
        } else {
            Node<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }

            current.setNext(null);
            tail = current;
        }

        count--;
    }

    public boolean isEmpty() {
        return count == 0;
    }


}
