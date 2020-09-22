package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapWordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        String[] arr = new String[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.next();
        }
        System.out.println(mapX(arr));

    }



    public static Map<String, Integer> mapX(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            } else {
                int count = map.get(strings[i]);
                count++;
                map.put(strings[i], count);
            }
        }
        return map;
    }
}


