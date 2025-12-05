package Lesson_15.Practic_2;

public class Node {
    String country;
    Node prev;
    Node next;

    public Node(String country) {
        this.country = country;
        this.prev = null;
        this.next = null;
    }
}

