import java.util.Scanner;

class AtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String result = "";
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i)=='a') {
                result=result+'b';
            } else result=result+a.charAt(i);
        }

        System.out.println(result);
    }
}
