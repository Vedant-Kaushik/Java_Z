import java.util.Scanner;
public class practise4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.print("Enter marks of subject 1 out of 100 = ");
       float sub1=sc.nextFloat();
       System.out.print("Enter marks of subject 2 out of 100 = ");
       float sub2=sc.nextFloat();
       System.out.print("Enter marks of subject 3 out of 100 = ");
       float sub3=sc.nextFloat();
       float total=((sub1+sub2+sub3)/3)*100;
       if(total>=40){
           if(sub1>=33 && sub2>=33 && sub3 >=33){
               System.out.println("Passed");
           }
           else {
               System.out.println("failed");
           }
       }
       else {
           System.out.println("failed");
        sc.close();
//        }
//        System.out.print("Enter you income(L) = ");
//        float inc= sc.nextFloat();
//        if(inc <=2.5){
//            System.out.println("Too poor to pay tax");
//        } else if(2.5 <= inc && inc <5) {
//            System.out.println("5% tax\nso final pay = "+inc*0.05+" lakhs" );
//        } else if(5.0 <= inc && inc <10.0) {
//            System.out.println("20% tax\nso final pay = " + inc * 0.20+" lakhs");
//        } else if(10.0 <= inc) {
//            System.out.println("30% tax\nso final pay = " + inc * 0.20+" lakhs");
//        }
//        System.out.print("Enter the number of day = ");
//        int num= sc.nextInt();
////        String wks= new String["monday","tuesday","wednesday","thursday","friday","saturday","sunday"];
//        if(num ==1){System.out.println("Monday");} else if (num==2) {
//            System.out.println("Tuesday");}else if (num==3) {
//            System.out.println("Wednesday");}else if (num==4) {
//            System.out.println("Thursday");}else if (num==5) {
//            System.out.println("Friday");}else if (num==6) {          switch will also do work
//            System.out.println("Saturday");}else if (num==7) {
//            System.out.println("Sunday");}else {
//            System.out.println("that's not even a day");
//        System.out.print("Enter year = ");
//        int yr= sc.nextInt();
//        if(yr%4==0){
//            if(yr%100!=0){
//                    System.out.println("Leap year");
//            }else {
//                System.out.println("Not a leap year");
//            }
//        }else {
//            System.out.println("Not a leap year");
       }
    }
}
