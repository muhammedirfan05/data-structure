import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int ru=0,rd=a.length-1,cl=0,cr=a[0].length-1,k=5;
        for(int z=0;z<k;z++)
        {
        while(rd>ru && cr>cl)
        {
            int p=0,l=0,temp=-1;
            boolean b=true;
            for(int i=ru;i<=rd;i++)
            {
                   if(b)
                   {
                       p=i;
                       l=cl;
                       b=false;
                   }
                   if(temp==-1)
                   {
                       temp=a[i][cl];
                   }
                   else{
                       int u=a[i][cl];
                       a[i][cl]=temp;
                       temp=u;
                       
                   }
            }
            cl++;
            for(int i=cl;i<=cr;i++)
            {
                int u=a[rd][i];
                a[rd][i]=temp;
                       temp=u;
            }
            rd--;
            if(ru>rd||cl>cr)
            return;
            for(int i=rd;i>=ru;i--)
            {
                int u=a[i][cr];
                 a[i][cr]=temp;
                       temp=u;
                       
            }
            cr--;
            for(int i=cr;i>=cl;i--)
            {
                 int u=a[ru][i];
                 a[ru][i]=temp;
                       temp=u;
            }
            ru++;
            a[p][l]=temp;
            temp=-1;
        }
        }
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
        
            System.out.print(a[i][j]+" ");
        }
            System.out.println();
        }
    }
}