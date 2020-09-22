package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapAB4 {

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
        if (map.containsKey("a") && map.containsKey("b")) {
            int la = map.get("a").length();
            int lb = map.get("b").length();
            if (la == lb) {
                map.put("a","");
                map.put("b","");
            } else if (la > lb){
                map.put("c",map.get("a"));
                } else {
                map.put("c",map.get("b"));
            }

        }
        return map;
    }
}


