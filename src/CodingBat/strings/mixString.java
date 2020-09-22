package strings;

import java.util.Scanner;

public class mixString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(love6(a,b));

    }

    static String love6(String a, String b) {
       StringBuilder sb =  new StringBuilder();
       for (int i=0; i < Math.min(a.length(), b.length()); i++) {
           sb.append(a.charAt(i))
                   .append(b.charAt(i));

       }
       if (a.length() > b.length()) {
           sb.append(a.substring(b.length()));
       } else sb.append(b.substring(a.length()));


       return sb.toString();

    }
}


