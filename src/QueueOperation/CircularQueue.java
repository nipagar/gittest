package QueueOperation;
import java.util.Scanner;
	public class CircularQueue {
		
			 private int q[], Maxsize,rear,front,count;
			public void createQueue(int size)
			{
				Maxsize=size;
				q=new int[Maxsize];
				rear=-1;
				front=0;
				count=0;
			}
			public void enqueue(int e)
			{
				count++;
				rear=(rear+1)%Maxsize;
				q[rear]=e;	
				
			}
			public boolean isfull() 
			{
				if(count==Maxsize) 
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			public int dequeue()
			{
				int temp;
				temp=q[front];
				front=(front+1)%Maxsize;
				count--;
				return temp;
			}
			public boolean isempty() 
			{
				if(count==0)
					return true;
				else
					return false;
			}
			public void display()
			{
				int i,c;
				i=front;
				c=0;
				while(c<count)
				{
					System.out.print(q[i]+"-->");
					i=(i+1)%Maxsize;
					c++;
				}
			} 
			

			public static void main(String[] args) {
				CircularQueue obj= new CircularQueue();
				
				int ch,e,size=5;
				System.out.println("enter the choice you want to perform");
				Scanner sc=new Scanner(System.in);
				obj.createQueue(size);
				do
				{
					System.out.println("\n1.Insert Element\n2.Delete Element\n3.Display Queue\n0.Exit");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter Element");
						Scanner scn= new Scanner(System.in);
						e=scn.nextInt();
						obj.enqueue(e);
						break;
					case 2:
						
						obj.dequeue();
						break;
					case 3:
						obj.display();
						break;
					case 0:
						System.out.println("Thanx for using code....");
						break;
					default:
						System.out.println("Wrong option...");
						
							
					}
					
				}while(ch!=0);
					
			}

			}