package QueueOperation;
import java.util.Scanner;
public class LinearQueue {
private int q[],Maxsize,rear,front;
	
	public  void createqueue(int size)
	{
		Maxsize=size;
		q=new int[Maxsize];
		rear=-1;
		front=0;
	}
    public void enqueue(int e)
    {
    	rear++;
    	q[rear]=e;
	
    }
    public int dequeue()
    {
    	int temp=q[front];
    	front++;
    	return temp;
    			
    }
    public void display()
    {
    	for(int i=front;i<=rear;i++)
    	{
    		System.out.println(q[i]);
    	}
        }
    
    
	public static void main(String[] args) {
		LinearQueue obj=new LinearQueue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue");
		int size=sc.nextInt();
		obj.createqueue(size);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
        obj.display();
        obj.dequeue();
        obj.dequeue();
       obj.display();
       
	}

}

