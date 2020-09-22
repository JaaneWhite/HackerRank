import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int booklength = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        String name = "";
        int phone = 0;
        for (int i = 1; i <= booklength; i++) {
            sc.nextLine();
            name = sc.nextLine();
            phone = sc.nextInt();
            map.put(name,phone);
        }
        sc.nextLine();
        while (sc.hasNextLine()) {
            String query = sc.nextLine();
            if (!map.containsKey(query)) {
                System.out.println("Not found");
            } else {
                System.out.println(query + "=" + map.get(query));
            }
        }

    }
}


