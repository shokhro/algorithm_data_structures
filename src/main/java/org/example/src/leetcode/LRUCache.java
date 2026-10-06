package org.example.src.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int capacity;
    private Map<Integer, Node> map = new HashMap();
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToTail(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            moveToTail(node);
        } else {
            Node node = new Node(key, value);
            if (map.size() < capacity) {
                addToTail(node);
            } else {
                map.remove(head.key);
                removeHead();
                addToTail(node);
            }
            map.put(key, node);
        }
    }

    private void moveToTail(Node node) {
        if (node != tail) {
            if (node != head) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                tail.next = node;
                node.prev = tail;
                tail = node;
                tail.next = null;
            } else {
                Node oldHead = removeHead();

                tail.next = oldHead;
                oldHead.prev = tail;
                tail = oldHead;
            }

        }
    }

    private Node removeHead() {
        if (head == tail) {
            Node tmp = head;
            head = null;
            tail = null;
            return tmp;
        } else {
            Node tmp = head;
            head = head.next;
            head.prev = null;
            tmp.next = null;
            return tmp;
        }
    }

    private void addToTail(Node node) {
        if (tail != null) {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        } else {
            head = node;
            tail = node;
        }
    }

    static class Node {
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */