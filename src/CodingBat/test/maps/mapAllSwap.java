package test.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapAllSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        String[] arr = new String[arrlength];
        for (int i = 0; i <= arrlength - 1; i++) {
            arr[i] = sc.next();
        }
        System.out.println(String.join(",",mapX(arr)));

    }



    public static String[] mapX(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String>arr2 = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
                if (!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
                arr2.add(strings[i]);
            } else {
                int firstindex = map.get(strings[i].substring(0, 1));
                String n = strings[firstindex];
                arr2.set(firstindex, strings[i]);
                arr2.add(strings[firstindex]);
                map.remove(strings[i].substring(0, 1));
            }
        }
        return arr2.toArray(new String[arr2.size()]);
    }
}


