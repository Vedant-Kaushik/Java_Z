import java.util.Scanner;
public class practise3 {
    public static void main(String[] args) {
//        1 question)

       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a string = ");
       String a= sc.nextLine();
       System.out.println(a.toLowerCase());
// ----------------------------------------------------
//        System.out.println(a.replace(" ","_"));
//        System.out.println(a.indexOf(" "));
//        System.out.println(a.indexOf("  "));
// ----------------------------------------------------
//        String temp="Dear <|name|>";
//        System.out.print("Enter name = ");
//        String name= sc.nextLine();
//        System.out.println(temp.replace("<|name|>",name));
    sc.close();
    }
}
