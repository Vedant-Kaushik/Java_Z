import java.util.Scanner;
// Define the circle class here
class Circle{
    public double radius;
    public Circle(double radius){
        this.radius=radius;// radius = 5
    }
    public double getArea(){
         return Math.PI*radius*radius;
    }
    public double calculateArea(){
        return getArea();
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double calculateCircumference(){
        return getCircumference();
    }
}
public class fewPractise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Create circle object
        Circle circle = new Circle(radius);

        // Calculate and print area
        double area = circle.calculateArea();
        // Print area to 2 decimal places
        System.out.printf("Area: %.2f\n", area);

        // Calculate and print circumference
        double circumference = circle.calculateCircumference();
        // Print circumference to 2 decimal places
        System.out.printf("Circumference: %.2f", circumference);
        scanner.close();
    }
}
