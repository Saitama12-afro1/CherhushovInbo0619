public class Pr {
    public static void main(String args[])
    {
        double sum=0;
        double n=0;
        for(int i=0;i<10;i++){
            n=1/((double)(1+i));
        System.out.println(n);
        sum=sum+n;
    }
        System.out.println();
        System.out.println("Сумма= "+sum);
    }
}
