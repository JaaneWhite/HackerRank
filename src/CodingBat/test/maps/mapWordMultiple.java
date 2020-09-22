package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapWordMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        String[] arr = new String[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.next();
        }
        System.out.println(mapX(arr));

    }



    public static Map<String, Boolean> mapX(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], false);
            } else {
                map.put(strings[i], true);
            }
        }
        return map;
    }
}


