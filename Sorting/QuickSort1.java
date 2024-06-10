package Sorting;
import java.util.*;
public class QuickSort1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)    a[i]=sc.nextInt();
        quickSort(a,0,n-1);
        sc.close();
    }
    public static void quickSort(int a[],int l,int h)
    {
        if(l<h)
        {
            int pivot=a[l];
            int i=l+1;
            int j=h;
            while(i<=j)
            {
                while(i<=h&&a[i]<pivot)
                    i++;
                while(j<=h&&a[j]>pivot)
                    j--;
                if(i<j)
                {
                    swap(a,i,j);
                    i++;
                    j--;
                }
            }
            swap(a,l,j);
            System.out.println(Arrays.toString(a));
            quickSort(a,l,j-1);
            quickSort(a,j+1,h);
        }
    }
    public static void swap(int a[],int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
/*6
45 78 12 49 11 6 */