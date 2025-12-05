package Lesson_15.Practic_2;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void addFirst(String country) {
        Node  newNode = new Node(country);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(String country) {
        Node  newNode = new Node(country);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public String getFirst() {
        if (head == null) {
            return null;
        }
        return head.country;
    }
    public String getLast() {
        if (tail == null) {
            return null;
        }
        return tail.country;
    }
    public String removeFirst() {
        if (head == null) {
            return null;
        }
        String removedCountry = head.country;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removedCountry;
    }
    public String removeLast() {
        if (tail == null) {
            return null;
        }
        String removedCountry = tail.country;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return removedCountry;
    }

    public void displayForward() {
        Node current = head;
        System.out.println("Прямой порядок: ");
        while (current != null) {
            System.out.println(current.country + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackward() {
        Node current = tail;
        System.out.println("Обратный порядок: ");
        while (current != null) {
            System.out.println(current.country + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
