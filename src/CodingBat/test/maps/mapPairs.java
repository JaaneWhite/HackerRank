package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        String[] strings = new String[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            strings[i] = sc.next();
        }

        System.out.println(mapX(strings));

    }



    public static Map<String, String> mapX(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0,1),strings[i].substring(strings[i].length()-1));
        }
        return map;
    }
}


