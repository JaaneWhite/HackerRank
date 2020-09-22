package strings;

import java.util.Scanner;

public class repeatEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(love6(str,n));

    }

    static String love6(String str, int n) {
       StringBuilder sb =  new StringBuilder();
       for (int i=n; i>=1; i--) {
           sb.append(str.substring(0,i));

       }
       return sb.toString();

    }
}


