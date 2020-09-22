package strings;

import java.util.Scanner;

public class starOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(love6(str));

    }

    static String love6(String str) {
       int l = str.length();
       if (l < 3) return str;
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i <= l-3; i++) {
           if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
               sb.append("zp");
               i = i + 2;
           } else {
               sb.append(str.charAt(i));
           }

       }
       if (!(str.charAt(l-3) == 'z' && str.charAt(l-1) == 'p')) {
           sb.append(str.substring(l-2));
       }


        return sb.toString();

    }
}


