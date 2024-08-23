//package folder .folderl1;

class a {
    protected int b=2;
    int c=3;
    void av() {
        System.out.println("hoop");
    }
}

class v extends a {

    public  v() {
        System.out.println(b+c);
    }
}

public class folder_q {
    public static void main(String[] args) {
        System.out.println("_");
        v z=new v();

    }
}