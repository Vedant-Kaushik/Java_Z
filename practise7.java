public class practise7 {
    // static void table(int n) {
    //     for (int i = 1; i < 11; i++) {
    //        System.out.println(n+" X "+i+" = "+n*i);

    //     }
    // }
    // static void pattern(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //     System.out.println();
    //     }
        static void fibo(int n) {
            int num1 = 0;
            int num2 = 1;
            System.out.print(num1+" ,"+num2+" ,");
            int i = 1;
            while (i <= n - 2) {
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                if(i==n-2)
                    System.out.print(sum + " ");
                else
                    System.out.print(sum + " ,");
                i++;
            }
            
        }
    
    public static void main(String[] args) {
        //     int a = 5;
        //     System.out.println("Table of " + a + " is =");
        //     table(a);
        // pattern(4);
        fibo(10);
    }
}
