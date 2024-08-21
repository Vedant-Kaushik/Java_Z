//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//class FountainPen extends Pen{
//     void write(){
//         System.out.println("writing with a fountain pen");
//     };
//     void refill(){
//         System.out.println("refiling it");
//    };
//     void changeNib(){
//         System.out.println("changing nib");
//     }
//}
interface BasicAnimal{
     void eat();
     void sleep();
}
class Monkey{
     void jump(){
        System.out.println("jump");
    }
     void bite(){
        System.out.println("bite");
    }
}
class human extends Monkey implements BasicAnimal{
     void jump(){
        System.out.println("jump human");
    }
     void bite(){
        System.out.println("bite human");
    }
    public void eat(){
        System.out.println("eat human");
    }
    public void sleep(){
        System.out.println("Sleep human");
    }
}
public class Practise11 {
    public static void main(String[] args) {
        Monkey m1=new Monkey();
//        Monkey.sleep();
        m1.bite();
        m1.jump();

    }
}
