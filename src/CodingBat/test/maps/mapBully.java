package test.maps;

import java.util.*;

public class mapBully {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int mapsize = sc.nextInt();
        Map<String, String> map = new HashMap<>();

        for (int i = 1; i <= mapsize; i++) {
            String key = sc.next();
            String value = sc.next();
            if (key != null) map.put(key,value);

        }
        System.out.println(mapX(map));

    }



    public static Map<String, String> mapX(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b",map.get("a"));
            map.put("a","");
        }

        return map;
    }
}


