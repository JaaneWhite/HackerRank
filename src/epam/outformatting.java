import java.util.Scanner;

public class outformatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String s2=s1;
            for (int n=0; n < (15-s1.length()); n++){
                s2 = s2+' ';
            }

            if (String.valueOf(x).length()==2) {
                s2=s2+"0";
           }else if (String.valueOf(x).length()==1){
                s2=s2+"00";
            }

            System.out.println(s2+x);

            //Complete this line
        }
        System.out.println("================================");

    }
}