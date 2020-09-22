import java.util.Scanner;

public class notstring {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scanner.nextLine();




        System.out.println(a.substring(0,a.length()-3)+a.substring(a.length()-3).toUpperCase());



        scanner.close();


    }
}