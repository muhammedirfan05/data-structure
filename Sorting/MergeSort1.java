package Sorting;
import java.util.*;
public class MergeSort1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        mergeSort(a,0,n-1);
        sc.close();
        // for(int i=0;i<n;i++)    System.out.print(a[i]+" ");
    }
    public static void mergeSort(int a[],int l,int h)
    {
        if(l<h)
        {
            int mid=(l+h)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,h);
            merge(a,l,mid,h);
            for(int i=0;i<a.length;i++)    System.out.print(a[i]+" ");
            System.out.println();
        }
    }
    public static void merge(int a[],int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int l1[]=new int[n1];
        int r1[]=new int[n2];
        for(int i=0;i<n1;i++)   l1[i]=a[i+l];
        for(int i=0;i<n2;i++)   r1[i]=a[i+mid+1];
        int i=0,j=0,k=l;
        while(i<n1&&j<n2)
        {
            if(l1[i]<=r1[j])
            {
                a[k]=l1[i];
                i++;
            }
            else
            {
                a[k]=r1[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=l1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=r1[j];
            j++;
            k++;
        }
    }
}
/*6
45 78 1249 116 */