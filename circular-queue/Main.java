import java.util.*;
public class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.display();
    }
}
class Queue
{
    int size=5;
    int a[]=new int[size];
    int front=-1,rear=-1;
    public void enqueue(int n)
    {
        if(front==(rear+1)%size)
            System.out.println("Queue is Full");
        else if(front==-1&&rear==-1)
        {
            front++;
            rear++;
            a[rear]=n;
        }
        else 
        {
            rear=(rear+1)%size;
            a[rear]=n;
        }
    }
    public void dequeue()
    {
        if(front==-1)
            System.out.println("Queue is Empty");
        else if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else 
            front=(front+1)%size;
    }
    public void peek()
    {
        System.out.println(a[front]);
    }
    public void display()
    {
        if(front==-1&&rear==-1)
            System.out.println("Queue is Empty");
        else
        {
            int i=front;
            while(i!=rear)
            {
                System.out.print(a[i]+" ");
                i=(i+1)%size;
            }
            System.out.print(a[rear]);
        }
    }
}
//modulo operator is used for converting the size like the clock time 13 for 1,14 for 2