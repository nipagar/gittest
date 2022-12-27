package StackOperation;
import java.util.Scanner;
public class StackOperations {
     int s[],MaxSize,tos;
	public void createStack(int size)
	{
		MaxSize= size;
		s=new int [MaxSize];
		tos=-1;
	}
	public void push(int e)
	{
		tos++;
		s[tos]=e;
	}
	public boolean isFull()
	{
		if(tos==MaxSize-1)
			return true;
		else
			return false;
	}
	public int pop()
	{
		int temp;
		temp=s[tos];
		tos--;
		return temp;
	}
	public boolean isempty()
	{
		if(tos==-1)
		return true;
		else
		return false;
	}
	public int peak()
	{
		return(s[tos]);
	}
	public void Display()
	{
		for(int i=tos;i>-1;i--)
		{
			System.out.println(s[i]);
		}
	}
	
	public static void main(String [] args)
	{
		StackOperations obj=new StackOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of stack");
		int size=sc.nextInt();
		obj.createStack(size);
		obj.push(50);
		obj.push(56);
		obj.push(78);
		obj.push(20);
		obj.pop();
		obj.pop();
		obj.peak();
		obj.Display();
	}
	
}

