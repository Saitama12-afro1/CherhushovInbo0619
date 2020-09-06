import java.util.Scanner;
public class Pr3 {
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = n;
        int sum=1;
        while(i>1)
        {
            sum=sum*(i--);
        }
        System.out.println(sum);
    }
}
