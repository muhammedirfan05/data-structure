// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args)
// 	{
// 	    Scanner sc=new Scanner(System.in);
// 	    int n=sc.nextInt();
// 	    printValue(n);
// 	}
// 	public static void printValue(int n)
// 	{
// 	   if(n==0)
// 	        return;
// 	    printValue(n-1);
// 	    System.out.println(n);
// 	}
// }
 
 
//  import java.util.*;
//  public class Main
//  {
//      public static void main(String arg[])
//      {
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();
//          System.out.println(findFibo(n));
//      }
//      public static int findFibo(int n)
//      {
//          if(n==1||n==2)
//             return 1;
//          return findFibo(n-1)+findFibo(n-2);
//      }
// }


import java.util.*;
public class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        char c[]={'s','e','a'};
        reversePrint(c,c.length-1);
    }
    public static void reversePrint(char c[],int len)
    {
        if(len==-1)
            return;
        reversePrint(c,len-1);
        System.out.println(c[len]);
    }
}