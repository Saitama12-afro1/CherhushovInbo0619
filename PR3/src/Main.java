import java.util.Scanner;
public class Main {
    public static void main(String [] arr)
    {
        Scanner input= new Scanner(System.in);
        double r= input.nextDouble();
        Krug ob= new Krug(r);
        System.out.println("Радиус"+ob.diametr(r));
        System.out.println("Длина"+ob.dlina(r));
        System.out.println("Площадь"+ob.Plosh(r));
        System.out.println("da");
    }
}
