import java.util.Scanner;

public class loopi {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i=1; i<=10; i++) {
                System.out.println(n+" x "+i+" = "+n*i);
            }


            scanner.close();
        }
    }
}