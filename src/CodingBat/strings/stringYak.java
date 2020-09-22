package strings;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class stringYak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(strYak(str));

    }

    static String strYak(String str) {
        int l = str.length();
        if (l <= 2 || !str.contains("yak")) {
            return str;
        }
        String res = "";
        int lastindex = 0;
        List<Integer> indexlist = new ArrayList<Integer>();
        while (lastindex != -1) {

            lastindex = str.indexOf("yak", lastindex);

            if (lastindex != -1) {
                indexlist.add(lastindex);
                lastindex += 1;
            }

        }
        System.out.println(indexlist);

        if (indexlist.size() == 1 && indexlist.get(0)==0) {
            res = res + str.substring(3);
        } else {

            int j = 0;
            for (int i = 0; i <= indexlist.size()-1; i++) {
                res = res + str.substring(j, indexlist.get(i));
                j = indexlist.get(i) + 3;
                System.out.println(res);
            }
            res = res + str.substring(j);
            }
        return res;
    }
}

