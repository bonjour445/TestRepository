package 实验6;
public class LinkedQueue {
    private Node head;
    private Node tail;
    public LinkedQueue() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
   public void enqueue(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: Front ");
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        sb.append("Rear");
        return sb.toString();
    }
}