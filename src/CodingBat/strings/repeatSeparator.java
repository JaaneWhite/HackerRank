package strings;

import java.util.Scanner;

public class repeatSeparator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String sep = sc.nextLine();
        int count = sc.nextInt();
        System.out.println(love6(word,sep,count));

    }

    static String love6(String word, String sep ,int count) {
       if (count == 0) return "";
       StringBuilder sb =  new StringBuilder();
       sb.append(word);
       for (int i=1; i<=count-1; i++) {
           sb.append(sep).append(word);

       }
       return sb.toString();

    }
}


