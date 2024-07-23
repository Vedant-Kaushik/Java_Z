// q1
class circle{
    public float area(){
        float radius=9;
        System.out.println("then I visited here");
        float area= (float) (3.14*radius*radius);
        return area;
    }
}
class cylinder extends circle{
    public float volume() {
        float height = 9;
        System.out.println("first visited here");
        float volume = (float) (area() * height);
        return volume;
    }
}
// q2
class Rectangle{

    public int getArea(){
        int l=4,b=3;
        int area=l*b;
        return area;
    }
    public int setArea(int area) {
        area = getArea();
        System.out.println("first here");
        return area;
    }
}
class cuboid extends Rectangle {

    public int getVolume(){
        int h =8;
        int volume= getArea() * h;
        return volume;
    }
    public int setVolume(int volume) {
        volume = getVolume();
        System.out.println("second here");
        return volume;
    }
}

public class Practise_ch_10 {
    public static void main(String[] args) {
        // q1
        cylinder cs=new cylinder();
        float ans=cs.volume();
        System.out.print("volume = "+ans);
        System.out.println();
        float sd=cs.area();
        System.out.print("area = "+sd);
        System.out.println();

        // q2
        cuboid c=new cuboid();
        int ans2= c.getArea();
        int ans3 =c.getVolume();
        System.out.println("area of rectangle accessed from cuboid object = "+ c.setArea(ans2));
        System.out.println("volume of cuboid = "+c.setVolume(ans3));
    }
}
