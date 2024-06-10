package Sorting;
import java.util.*;
public class BubbleSort1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)    a[i]=sc.nextInt();
        bubbleSort(n,a);
        sc.close();
    }
    public static void bubbleSort(int n,int a[])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
            for(int z=0;z<n;z++)
                System.out.print(a[z]+" ");
            System.out.println();
        }
    }
}
/*6
20 40 3 11 80 15*/