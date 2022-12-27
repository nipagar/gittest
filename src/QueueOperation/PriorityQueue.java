package QueueOperation;
import java.util.*;
public class PriorityQueue 
{
	int maxsize,q[],rear,front;
	public void createqueue(int size)
	{
		rear=-1;
		front=0;
		maxsize=size;
		q = new int[maxsize];
				
	}
	
	public void enqueue(int e)
	{
		
		rear++;
		q[rear]=e;
		for (int i=front; i<rear;i++)

		{
			for (int j =front; j<rear; j++)
			{
				if (q[j]>q[j+1])
				{
					int t=q[j];
					q[j]=q[j+1];
					q[j+1]=t; 
				}
			}
		}	
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
		// TODO Auto-generated method stub
		PriorityQueue  obj = new PriorityQueue ();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of priority queue");
		int o=sc.nextInt();
		obj.createqueue(o);
		obj.enqueue(10);
		obj.enqueue(50);
		obj.enqueue(40);
		obj.enqueue(30);
		obj.enqueue(20);
		obj.enqueue(29);
		obj.enqueue(90);
	//	obj.dequeue();
	//	obj.dequeue();
		obj.display();
	}

}