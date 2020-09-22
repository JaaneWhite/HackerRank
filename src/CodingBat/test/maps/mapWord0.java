package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapWord0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        String[] arr = new String[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.next();
        }

        System.out.println(mapX(arr));

    }



    public static Map<String, Integer> mapX(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],0);
        }
        return map;
    }
}


