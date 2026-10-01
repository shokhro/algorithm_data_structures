package org.example.src.algorithms.spiski;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public void addFirst(T value) {
        addFirst(new Node<T>(value));
    }

    public void addLast(T value) {
        addLast(new Node<T>(value));
    }

    private void addLast(Node<T> node) {
        if (node == null)
            throw new IllegalArgumentException("node null bo'lishi mumkun emas");

        node.next = null;

        if (count == 0) {
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
        count++;
    }

    private void addFirst(Node<T> node) {
        //save of the current head
        Node<T> tmp = head;

        head = node;

        //shifting the former head
        head.next = tmp;

        count++;

        if (count == 1) {
            tail = head;
        }

    }

    public void removeFirst() {
        if (count == 0)
            throw new NoSuchElementException("Ro'yxat bo'sh");

        head = head.next;

        if (count == 1)
            tail = null;

        count--;
    }

    public void removeLast() {
        if (count == 0)
            throw new NoSuchElementException("Ro'yxat bo'sh");

        if (count == 1) {
            //royxatda bitta element bo'lsa, uni o'chirgach ro'yxat bo'sh bo'ladi, shuning uchun null qilamiz.
            head = tail = null;
        } else {
            //ohiridan oldingi node'ni topamiz
            Node<T> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }

        count--;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getCount() {
        return count;
    }

    //private olib tashlandi unit test uchun.
    static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
}
