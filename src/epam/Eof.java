import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Eof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            i++;
            System.out.println(i + " " + line);
        }
    }
}
