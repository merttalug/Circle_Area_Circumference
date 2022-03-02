package TemelVeriTipleriVeKullaniciGirisleri;
import java.util.Scanner;
public class Circle {

    public static void main(String[] args) {

        double r,circumference,area,pi=3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println("Input the radius of the Circle: ");
        r=inp.nextDouble();

        circumference= 2*pi*r;
        area=pi*(r*r);

        System.out.println("The Circle's Circumference: " +circumference);
        System.out.println("The Circle's Area: " + area);








    }
}
