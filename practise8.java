class employee{
    int salary;
    public int getSalary(){
        return salary;
    }

    String name;
    public String getName(){
        return name;
    }

    public void setName() {

    }
}
public class practise8 {
    public static void main(String[] args) {
        employee khan = new employee();
        employee jack =new employee();
        khan.salary=129;
        jack.salary=98;
        khan.name="khan";
        jack.name="jack";
        System.out.println(khan.getName()+ " salary is = "+khan.getSalary());
        System.out.println(jack.getName()+ " salary is = "+jack.getSalary());


    }
}
