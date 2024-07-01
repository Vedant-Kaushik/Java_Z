//class employee{
//    int salary;
//    public int getSalary(){
//        return salary;
//    }
//
//    String name;
//    public String getName(){
//        return name;
//    }
//
//    public void setName() {
//
//    }
//}
class sq{
    int side;

    public int setArea() {
        return side*side;
    }

    public int setPerimeter() {
        return 4*side;
    }
}
public class practise8 {
    public static void main(String[] args) {
//        employee khan = new employee();
//        employee jack =new employee();
//        khan.salary=129;
//        jack.salary=98;
//        khan.name="khan";
//        jack.name="jack";
//        System.out.println(khan.getName()+ " salary is = "+khan.getSalary());
//        System.out.println(jack.getName()+ " salary is = "+jack.getSalary());
//        --------------------------------------------------------------------------
        sq square1=new sq();
        sq square2=new sq();
        square1.side=3;
        square2.side=5;
        System.out.println("Perimeter1 = "+square1.setPerimeter()+" and Area1 = "+square1.setArea());
        System.out.println("Perimeter2 = "+square2.setPerimeter()+" and Area2 = "+square2.setArea());
    }
}
