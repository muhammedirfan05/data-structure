import java.util.*;
public class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        MyGraph mg=new MyGraph(5);
        mg.addEdge(0,1);
        mg.addEdge(0,3);
        mg.addEdge(1,2);
        mg.addEdge(1,3);
        mg.addEdge(2,4);
        mg.addEdge(3,4);
        mg.display();
        System.out.print("BFS=>");
        mg.bfs(0);
        System.out.print("DFS=>");
        mg.dfs(0);
    }
}
class MyGraph
{
    ArrayList<ArrayList<Integer>>al=new ArrayList<>();
    public MyGraph(int n)
    {
        for(int i=0;i<n;i++)
            al.add(new ArrayList<>());
    }
    public void addEdge(int u,int v)
    {
        al.get(u).add(v);
        al.get(v).add(u);
    }
    public void display()
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.print("ELEMENTS OF "+i+"'s LIST=> ");
            for(int j=0;j<al.get(i).size();j++)
                System.out.print(al.get(i).get(j)+" ");
            System.out.println();
        }
    }
    public void bfs(int n)
    {
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[al.size()];
        q.add(n);
        vis[n]=true;
        while(q.size()!=0)
        {
            int ver=q.remove();
            System.out.print(ver+" ");
            for(int i=0;i<al.get(ver).size();i++)
            {
                int av=al.get(ver).get(i);
                if(!vis[av])
                {
                    q.add(av);
                    vis[av]=true;
                }
            }
        }
        System.out.println();
    }
    public void dfs(int n)
    {
        Stack<Integer>s=new Stack<>();
        boolean vis[]=new boolean[al.size()];
        s.push(n);
        vis[n]=true;
        while(s.size()!=0)
        {
            int ver=s.pop();
            System.out.print(ver+" ");
            for(int i=0;i<al.get(ver).size();i++)
            {
                int av=al.get(ver).get(i);
                if(!vis[av])
                {
                    s.add(av);
                    vis[av]=true;
                }
            }
        }
    }
    
}