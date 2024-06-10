package Sorting;
import java.util.*;
public class SelectionSort1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        selectionSort(a,n);
        sc.close();
    }
    public static void selectionSort(int a[],int n)
    {
        int t[]=new int[n];
        for(int i=0;i<n;i++)    t[i]=a[i];
        int min,z;
        for(int i=0;i<n;i++)
        {
            z=0;
            min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++)
            {
                if(min>t[j])
                {
                    min=t[j];
                    z=j;
                }
            }
            t[z]=t[i];
            t[i]=min;
            for(int x=0;x<n;x++)
                System.out.print(t[x]+" ");
            System.out.println();
            
        }
    }
}