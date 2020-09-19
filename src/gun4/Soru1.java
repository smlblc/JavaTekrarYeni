package gun4;

public class Soru1 {
    // double d=(50/3)  ya da          double d= ( double ) (50/3) mi olmali?
    public static void main(String[] args) {
        double d=(double) (50/3); //16.0
        System.out.println(d);
        System.out.println("------");
        double e=50/3;
        System.out.println(e);  //16.0
        double f=50/3.0;
        System.out.println(f); //16.666666666666668
        double g=50.0/3;
        System.out.println(g); //16.666666666666668
        double h=50.0/3.0;
        System.out.println(h); //16.666666666666668


    }
}
