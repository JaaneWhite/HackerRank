package strings;

import java.util.Scanner;

public class xyBalance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(love6(str));

    }

    static String love6(String str) {
       return  str.replaceAll("(.?)(\\*+)(.?)","");


    }
}


