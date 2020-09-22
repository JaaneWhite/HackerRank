package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapWordAppend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        String[] arr = new String[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.next();
        }
        System.out.println(mapX(arr));

    }



    public static String mapX(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            } else {
                int count = map.get(strings[i]);
                count++;
                map.put(strings[i], count);
                if (count % 2 == 0) {
                    res.append(strings[i]);
                }
            }
        }
        return res.toString();
    }
}


