package strings;

import java.util.Scanner;

public class plusOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();

        System.out.println(love6(str, word));

    }

    static String love6(String str, String word) {
       int lw = word.length();
       int ls = str.length();
       if (lw > ls) return str;
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < ls; i++) {
           if (str.substring(i).startsWith(word)) {
               sb.append(word);
               i += lw-1;
               } else {
               sb.append("+");
           }

       }
        return sb.toString();

    }
}


