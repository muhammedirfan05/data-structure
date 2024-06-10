package Searching;
import java.util.*;
public class LinearSearch
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)    a[i]=sc.nextInt();
        int k=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(k==a[i])
            {
                System.out.println("Element "+k+" is present at location "+i);
                checkCase(i,n);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void checkCase(int i,int n)
    {
        if(i==0)
            System.out.println("Best Case");
        else if(i==n-1)
            System.out.println("Worst Case");
    }
}
/*7
20 3 6 715 2
1 */