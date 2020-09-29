import java.util.Scanner;

public class mdArray2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] arr = new String[4][4];


        for (int i = 0; i <= 3; i++) {
            String str = sc.nextLine();
            for (int j = 0; j <= 3; j++) {
                arr [i][j] = str.substring(j,j+1);
            }
        }

        boolean pretty = true;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (arr[i][j].equals(arr[i][j+1]) && arr[i][j].equals(arr[i+1][j]) && arr[i][j].equals(arr[i+1][j+1])) {
                    pretty = false;
                    break;

                    }
                }
            }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        if (pretty) {
        System.out.println("YES");}
        else {System.out.println("NO");}
    }


}

