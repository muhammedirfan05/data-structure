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
        q.display();
        q.peek();
    }
}
class Queue
{
    int a[]=new int[5];
    int front=-1,rear=-1;
    public void enqueue(int n)
    {
        if(rear==a.length-1)
            System.out.println("Queue is Full");
        else if(front==-1&&rear==-1)
        {
            front++;
            rear++;
            a[rear]=n;
        }
        else 
        {
            rear++;
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
            front++;
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
        
            for(int i=front;i<=rear;i++)
                System.out.print(a[i]+" ");
        }
    }
}
//queue after dequeue the size of the queue will not change so we cannot able to enqueue elements so we are using circular queue