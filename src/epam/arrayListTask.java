import java.util.ArrayList;
import java.util.Scanner;

class arrayListTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //сборка массива
        int n = sc.nextInt();
        ArrayList <ArrayList> big = new ArrayList<ArrayList>();
        for (int i = 1; i<=n; i++) {
            int n2 = sc.nextInt();
            ArrayList <Integer> inner = new ArrayList<Integer>();
            for (int j = 1; j<=n2; j++) {
                inner.add(sc.nextInt());
            }
            big.add(inner);
        }
        //тесты
        int qn = sc.nextInt();
        for (int i = 1; i<=qn; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (big.size() < x) {
                System.out.println("ERROR!");
                continue;
            }
            if (big.get(x-1).size() < y) {
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(big.get(x-1).get(y-1));

        }
    }
}
