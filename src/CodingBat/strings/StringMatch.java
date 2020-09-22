package strings;

import java.util.Scanner;

public class StringMatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(strMatch(a, b));

    }

    static int strMatch(String a, String b) {
       int length = Math.min(a.length(),b.length());
       int res = 0;
       if (length >=2) {
           for (int i = 0; i <= length - 2; i++) {
               if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                   res++;
               }

           }
       }
        return res;
    }
}

