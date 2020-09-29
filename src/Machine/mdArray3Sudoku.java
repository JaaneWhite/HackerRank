import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class mdArray3Sudoku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smArL = sc.nextInt();
        int sudokuSize = smArL * smArL;
        int [][] arr = new int [sudokuSize][sudokuSize];


        for (int i = 0; i <= sudokuSize - 1; i++) {
            for (int j = 0; j <= sudokuSize - 1; j++) {
                arr [i][j] = sc.nextInt();
            }
        }
        boolean solved = true;

        for (int i = 0; i <= smArL; i += smArL) {
            HashMap<Integer, Integer> numbers = new HashMap<>();
            for (int j = 1; i <= smArL; i++) {
                numbers.put(j, 0);
            }
        }






        for (int i = 0; i <= sudokuSize - 1; i++) {
            for (int j = 0; j <= sudokuSize - 1; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }


}

