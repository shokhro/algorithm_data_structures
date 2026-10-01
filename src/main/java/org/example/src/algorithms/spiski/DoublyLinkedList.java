package org.example.src.algorithms.spiski;

public class DoublyLinkedList<T> {
    private DoublyLinkedNote<T> head;
    private DoublyLinkedNote<T> tail;
    private int count;

    public void addFirst(T value) {
        addFirst(new DoublyLinkedNote<>(value));
    }

    public void addLast(T value) {
        addLast(new DoublyLinkedNote<>(value));
    }

    private void addFirst(DoublyLinkedNote<T> note) {
        //save of the head
        DoublyLinkedNote<T> temp = head;
        //point head to note
        head = note;
        //insert the rest of the list after the head
        head.next = temp;

        if (isEmpty()) {
            tail = head;
        } else {
            //before:   3(head) <-----> 5 <-> 7 -> null
            //after:    9(head) <-----> 3 <-> 5 <-> 7 -> null

            //update "previous" ref of the former head
            temp.previous = head;
        }
        count++;
    }

    private void addLast(DoublyLinkedNote<T> note) {

        if (isEmpty()) {
            head = note;
            tail = note;
        } else {
            tail.next = note;

        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public DoublyLinkedNote<T> getHead() {
        return head;
    }

    public void setHead(DoublyLinkedNote<T> head) {
        this.head = head;
    }

    public DoublyLinkedNote<T> getTail() {
        return tail;
    }

    public void setTail(DoublyLinkedNote<T> tail) {
        this.tail = tail;
    }

    static class DoublyLinkedNote<T> {
        private DoublyLinkedNote<T> previous;
        private DoublyLinkedNote<T> next;
        private T value;

        public DoublyLinkedNote(T value) {
            this.value = value;
        }

        public DoublyLinkedNote<T> getPrevious() {
            return previous;
        }

        public void setPrevious(DoublyLinkedNote<T> previous) {
            this.previous = previous;
        }

        public DoublyLinkedNote<T> getNext() {
            return next;
        }

        public void setNext(DoublyLinkedNote<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
