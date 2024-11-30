package 实验4;

public class JosephusLinkedList {
    public static void solveJosephusLinkedList(Node head, int k) {
        if (head == null) return;

        Node prev = null, current = head;
        while (current.next != null) { // 只有一个节点时停止
            for (int i = 1; i < k; i++) {
                prev = current;
                current = current.next;
            }
            System.out.println("Removed: " + current.data);
            prev.next = current.next;
            current = prev.next;
        }
        System.out.println("Last person standing: " + current.data);
    }

    public static Node createLinkedList(int n) {
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = createLinkedList(10); // 创建包含10个节点的链表
        solveJosephusLinkedList(head, 3);
    }
}
