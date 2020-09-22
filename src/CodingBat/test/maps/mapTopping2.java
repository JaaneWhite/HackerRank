package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapTopping2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int mapsize = sc.nextInt();
        sc.nextLine();
        Map<String, String> map = new HashMap<>();

        for (int i = 1; i <= mapsize; i++) {
            String key = sc.nextLine();
            String value = sc.nextLine();
            if (key != null) map.put(key,value);

        }
        System.out.println(mapX(map));

    }



    public static Map<String, String> mapX(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt",map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach","nuts");
        }
        return map;

    }
}


