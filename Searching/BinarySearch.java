package Searching;
import java.util.*;
public class BinarySearch
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)    a[i]=sc.nextInt();
        int k=sc.nextInt();
        sc.close();
        int l=0,r=n-1,c=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==k)
            {
                System.out.println(k+" found at location "+mid);
                System.out.println((c+1)+" comparisons are done");
                return;
            }
            else if(a[mid]>k)
                r=mid-1;
            else
                l=mid+1;
            c++;
        }
        System.out.println("Not found");
        System.out.println(c+" comparisons are done");
    }   
}
/*5
10 20 30 50
50 */
