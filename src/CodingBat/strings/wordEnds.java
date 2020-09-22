package strings;

import java.util.Scanner;

public class wordEnds {

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
       if (str.equals(word)) return "";
       StringBuilder sb = new StringBuilder();
        if (str.startsWith(word)) {
            sb.append(str.charAt(lw));
        }
       for (int i = 1; i < ls; i++) {
           if (str.substring(i).startsWith(word)) {
               if (i<ls-lw) {
                   sb.append(str.charAt(i - 1)).append(str.charAt(i + lw));
               } else {
                   sb.append(str.charAt(i - 1));
               }
               }
           }
        return sb.toString();
       }


    }




