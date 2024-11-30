package 实验4;

public class JosephusProblem {
    public static void solveJosephus(int n, int k) {
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = i + 1;
        }
        int index = 0;
        while (n > 0) {
            index = (index + k - 1) % n;
            System.out.println("Removed: " + people[index]);
            for (int i = index; i < n - 1; i++) {
                people[i] = people[i + 1];
            }
            n--;
        }
    }

    public static void main(String[] args) {
        solveJosephus(10, 3); // 10个人，数到3的人出列
    }
}

