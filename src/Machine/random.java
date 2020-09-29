import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            Random r = new Random();
            sum = sum + r.nextInt(b - a + 1) + a;
        }

            System.out.println(sum);
        }
    }




