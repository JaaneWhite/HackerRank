package strings;

import java.util.Scanner;

public class getSandwich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(love6(str));

    }

    static String love6(String str) {
       if (!str.contains("bread")) return "";
       int first = str.indexOf("bread");       int last = str.lastIndexOf("bread");
       if (first == last) return "";

       return str.substring(first+5,last);



    }
}


