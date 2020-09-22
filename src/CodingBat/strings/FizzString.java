package strings;

import java.util.Scanner;

public class FizzString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(strX(str));

    }

    static String strX(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } return str;

      }
    }

