import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner S=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=S.nextInt();
        }
        Arrays.sort(arr);
        long maxsum=0;
        for(int i=1;i<5;i++)
        {
            maxsum=maxsum+arr[i];
        }
        long minsum=0;
        for(int i=0;i<4;i++)
        {
            minsum=minsum+arr[i];
        }
        System.out.print(minsum+" ");
        System.out.print(maxsum);
    }
}
