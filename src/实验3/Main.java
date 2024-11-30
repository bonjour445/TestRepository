package 实验3;
public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> l0 = new SingleLinkedList<Integer>();
        Integer values0[] = {11, 21, 21, 34, 25, 16, 21, 28};
        SingleLinkedList<Integer> l2 = new SingleLinkedList<Integer>(values0);

        l2.insert(8);//l2执行insert方法
        System.out.println(l2);
        System.out.println(l2.size());
        System.out.println(l2.get(3));

        String str0[] = {"A", "B", "C", "D", "D", "k"};
        SingleLinkedList<String> s1 = new SingleLinkedList<String>(str0);

        s1.insert("H");//调用insert，remove方法
        System.out.println(s1);
        s1.insert(5, "K");
        System.out.println(s1);
        s1.remove(5);
        System.out.println(s1);
        s1.removeAll("D");
        System.out.println(s1);

        l2.replaceAll(21, 25);//调用replace方法
        System.out.println(l2);
        l2.removeAll(25);
        System.out.println(l2);

        Integer values1[] = {31, 24, 21, 34, 25, 16, 51, 48};
        Integer values2[] = {34, 25, 16};
        Integer values3[] = {34, 55, 16};
        SingleLinkedList<Integer> l3 = new SingleLinkedList<Integer>(values1);
        SingleLinkedList<Integer> l4 = new SingleLinkedList<Integer>(values2);
        SingleLinkedList<Integer> l5 = new SingleLinkedList<Integer>(values3);
        if (l3.containsAll(l4) == false)
            System.out.println("不包含");
        else
            System.out.println("包含");
        if (l3.containsAll(l5) == false)
            System.out.println("不包含");
        else
            System.out.println("包含");


    }
}
