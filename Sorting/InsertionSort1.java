package Sorting;
import java.util.*;
public class InsertionSort1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)    a[i]=sc.nextInt();
        insertionSort(n,a);
        sc.close();
    }
    public static void insertionSort(int n,int a[])
    {
        for(int i=0;i<n;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0&&key<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            for(int z=0;z<n;z++)    System.out.print(a[z]+" ");
            System.out.println();
        }
    }
}
/*8
20 40 3 11 80 158 10 */