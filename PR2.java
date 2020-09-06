public class PR2 {
    public static void qsort(int[] arr, int l, int h) {
        if (l >= h)
            return;
        int opora = arr[l + (h - l) / 2];
        int i = l, j = h;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }

            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j)
            qsort(arr, l, j);

        if (h > i)
            qsort(arr, i, h);
    }
    public static void main(String arg[]){
        int[] arr=new int [10];
        for(int i=0;i<10;i++)
        {
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        System.out.println();

            qsort(arr,0,9);
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}