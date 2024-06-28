import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner f= new Scanner(System.in);

        System.out.print("Enter the full marks of paper = ");
        int tm=f.nextInt();
        int sum =0,i;
        for ( i = 1; i < 6; i++) {
            System.out.print("Marks of subject " + i);
            System.out.print(" = ");
            int a = f.nextInt();
            sum=a+sum;
        }
        System.out.print("final percentage = "+ (sum*100/(5*tm)));
        System.out.print("%");
    }
}