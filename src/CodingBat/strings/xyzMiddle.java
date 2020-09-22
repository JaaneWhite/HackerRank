package strings;

import java.util.Scanner;

public class xyzMiddle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(love6(str));

    }

    static boolean love6(String str) {
        if (str.length() <= 2) return false;
        int center = str.length()/2;
        if (str.length()%2 == 1) {
            if (str.substring(center-1).startsWith("xyz")) return true;
        } else {
            if (str.substring(center-1).startsWith("xyz")) return true;
            if (str.substring(center-2).startsWith("xyz")) return true;
        }

        return false;
    }
}


