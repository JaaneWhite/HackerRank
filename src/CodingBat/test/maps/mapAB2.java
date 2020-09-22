package test.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapAB2 {

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
        if ((map.containsKey("a") && map.containsKey("b")) && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}


