//
//class Employee {
//    private final int salary;
//
//    public Employee(int salary) {
//        this.salary = salary;
//    }
//
//    public void work() {
//        System.out.println("working as an employee!");
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//}
//class HRManager extends Employee{
//    private final int wage;
//    public HRManager(int wage) {
//        super(0);
//        this.wage = wage;
//
//    }
//    public int getSalary() {
//        return wage;
//    }
//
//    public void work() {
//        System.out.println("Managing employees");
//    }
//    public void addEmployee(){
//        System.out.println("Adding new employee!");
//    }
//}
//public class fewPractise3 {
//    public static void main(String[] args) {
//        Employee emp = new Employee(40000);
//        HRManager mgr = new HRManager(70000);
//        emp.work();
//        System.out.println("Employee salary: " + emp.getSalary());
//        System.out.println();
//        mgr.work();
//        System.out.println("Manager salary: " + mgr.getSalary());
//        System.out.println();
//        mgr.addEmployee();
//    }
//}

class access {
    public int x;
    private int y;

    void cal(int a, int b) {
        x = a + 1;
        y = b;
    }

    void print() {
        System.out.println(" " + y);
    }
}

public class fewPractise3 {
    public static void main(String args[]) {
        access obj = new access();
        obj.cal(2, 3);
        System.out.print(obj.x);
        obj.print();
    }
}