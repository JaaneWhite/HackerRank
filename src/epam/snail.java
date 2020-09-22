import java.util.Scanner;

class snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 0;
        int days = 0;
        do {
            n = n + a;
            if (n < h) {
                n = n - b;
            }
            days++;

        }
        while (n < h);
        System.out.println(days);
    }
}
