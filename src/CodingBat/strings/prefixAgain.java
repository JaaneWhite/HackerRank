package strings;

import java.util.Scanner;

public class prefixAgain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(love6(str, n));

    }

    static boolean love6(String str, int n) {
       String str1 =  str.substring(0,n);
       if (str.substring(n).contains(str1)) return true;
       return false;

    }
}


