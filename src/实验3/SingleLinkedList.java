
package 实验3;

public class SingleLinkedList<T> {

    // 链表的头节点
    private Node head;

    // 构造函数，初始化头节点
    public SingleLinkedList() {
        head = null;
    }
    // 获取链表的长度
    public int size() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // 获取链表中特定位置的元素
    public T get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return (T) current.data;
            }
            count++;
            current = current.next;
        }
        return null; // Index out of bounds
    }

    // 在链表末尾插入元素
    public void insert(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // 从链表中移除特定元素
    public void remove(T data) {
        Node temp = head, prev = null;
        if (temp != null && temp.data.equals(data)) {
            head = temp.next;
            temp = null;
            return;
        }
        while (temp != null && !temp.data.equals(data)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
        temp = null;
    }

    // 移除链表中所有匹配的元素
    public void removeAll(T data) {
        if (head == null) {
            return;
        }
        head = removeElement(head, data);
    }

    // 辅助方法，用于递归删除元素
    private Node removeElement(Node curr, T data) {
        if (curr == null) {
            return null;
        }
        curr.next = removeElement(curr.next, data);
        if (curr.data.equals(data)) {
            return curr.next;
        }
        return curr;
    }

    // 检查当前链表是否包含所有指定元素
    public boolean containsAll(SingleLinkedList<T> otherList) {
        Node current = otherList.head;
        while (current != null) {
            if (!contains(current.data)) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    // 检查当前链表是否包含某个元素
    public boolean contains(Object data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    // 替换链表中所有与给定值相等的元素为新值
    public void replaceAll(T oldData, T newData) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(oldData)) {
                current.data = newData;
            }
            current = current.next;
        }
    }






}
