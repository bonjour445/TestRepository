package 实验5;
public class SeqStack {
    private int[] stack;
    private int top;
    private int capacity;
    public SeqStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stack[top];
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: Top ");
        for (int i = top; i >= 0; i--) {
            sb.append(stack[i]).append(" ");
        }
        sb.append("Bottom");
        return sb.toString();
    }
}