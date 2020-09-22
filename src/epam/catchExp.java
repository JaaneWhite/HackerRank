import java.util.InputMismatchException;
import java.util.Scanner;

class catchExp {
    public static void main(String []argh)
    {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x / y);
        }
        catch(InputMismatchException | ArithmeticException e)
            {
                if (e instanceof ArithmeticException) {
                    System.out.println("java.lang.ArithmeticException: / by zero");
                } else if (e instanceof InputMismatchException){
                    System.out.println("java.util.InputMismatchException");
                }
            }


        }
    }
