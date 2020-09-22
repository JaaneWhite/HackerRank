package strings;

import java.util.Scanner;

public class sameStarChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(love6(str));

    }

    static boolean love6(String str) {
        int allstarcount = 0;
        int goodstarcount = 0;
        if (str.startsWith("*")) {
            allstarcount++;
            goodstarcount++;
        }
        if (str.endsWith("*")) {
            allstarcount++;
            goodstarcount++;
        }
       for (int i=1; i < str.length()-1; i++) {
           if (str.charAt(i) == '*') {
               allstarcount++;
               if (str.charAt(i-1) == str.charAt(i+1)) goodstarcount++;
           }
       }
        System.out.println(allstarcount + " " + goodstarcount);

       return (allstarcount == goodstarcount);

    }
}


