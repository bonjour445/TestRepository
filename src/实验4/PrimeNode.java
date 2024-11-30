package 实验4;
public class PrimeNode {
        int data;
        PrimeNode next;

        PrimeNode(int data) {
            this.data = data;
            this.next = null;
        }

    public class PrimeNumber {
        public static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        public static PrimeNode findPrimes(int n) {
            PrimeNode head = new PrimeNode(0); // 创建一个哑节点
            PrimeNode current = head;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    current.next = new PrimeNode(i);
                    current = current.next;
                }
            }
            return head.next; // 返回哑节点的下一个节点，即第一个素数节点
        }

        public static void printPrimes(PrimeNode head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            PrimeNode primesHead = findPrimes(100); // 找出100以内的所有素数
            printPrimes(primesHead);
        }
    }
}
