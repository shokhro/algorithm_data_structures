package org.example.src.algorithms.spiski;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    // ---------- yordamchi metodlar ----------

    /** head dan boshlab tail gacha yurib, qiymatlarni List ga yig'adi. */
    private List<Integer> toList() {
        List<Integer> result = new ArrayList<>();
        SinglyLinkedList.Node<Integer> current = list.getHead();
        while (current != null) {
            result.add(current.value);
            current = current.next;
        }
        return result;
    }

    /** Har qanday holatda bajarilishi shart bo'lgan qoidalarni tekshiradi. */
    private void assertInvariants() {
        int size = toList().size();
        assertEquals(size, list.getCount(), "count haqiqiy uzunlikga teng bo'lishi kerak");
    }
}

















