import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class jDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
               // deque.removeFirst();
                int first = (int) deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }

        }
        if (set.size() > m) max = m;
        System.out.println(max);
    }
}