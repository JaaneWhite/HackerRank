import java.util.Scanner;

public class mdArray2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlength = 4;
        String [][] arr = new String[4][4];


        for (int i = 0; i <= arrlength - 1; i++) {
            for (int j = 0; j <= arrlength - 1; j++) {
                arr [i][j] = ".";
            }
        }

        int center = arrlength / 2;

        for (int i = 0; i <= arrlength - 1; i++) {
            arr[center][i] = "*";
            arr[i][center] = "*";
            arr [i][i] = "*";
            arr [i][arrlength-1-i] = "*";

        }


        for (int i = 0; i <= arrlength - 1; i++) {
            for (int j = 0; j <= arrlength - 1; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }


}

