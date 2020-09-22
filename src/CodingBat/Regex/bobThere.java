package Regex;

import java.util.Scanner;

public class bobThere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(love6(str));

    }

    static boolean love6(String str) {
       String str1 =  str.replaceAll("b.b","bob");
       if (str1.contains("bob")) return true;
       return false;

    }
}


