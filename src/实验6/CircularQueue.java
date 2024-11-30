package 实验6;

public class CircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = queue[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: Front ");
        for (int i = head; i != tail - 1; i = (i + 1) % capacity) {
            sb.append(queue[i]).append(" ");
        }
        if (!isEmpty()) {
            sb.append(queue[tail - 1]);
        }
        sb.append(" Rear");
        return sb.toString();
    }
}