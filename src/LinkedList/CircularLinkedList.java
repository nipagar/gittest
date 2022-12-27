package LinkedList;
import java.util.Scanner;
 class Node
{
	int data;
	Node next;
	Node (int data )
	{
		this.data=data;
		next=null;
	}
}
		
public class CircularLinkedList {
	Node root,last;
	public void createList()
	{
		root=last=null;
	}
	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next=root;
		}
		else
		{
			n.next=root;
			root=n;
			last.next=root;
		}
		System.out.println("Node inserted..");
	}
	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null) 
		{
			root=last=n;
			last.next=root;
		}
		else
		{
			last.next=n;
			last=n;
			last.next=root;
		}
		System.out.println("Node inserted..");
	}
	public void deleteLeft()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			root=root.next;
			last.next=root;
			System.out.println(t.data + "delete");
		}
	}
	public void deleteRight()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			Node t2=t;
			while(t.next!=last)
			{
				t2=t;
				t=t.next;
			}
			last=t2;
			last.next=root;
			System.out.println(t.data + "delete");
		}
	}
	public void printList()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node t=root;
			do
			{
				System.out.print(t.data+" -->");
				t=t.next;
			}while(t!=root);
		}
	}
public static void main(String [] args)
{
	CircularLinkedList obj= new CircularLinkedList();
	Scanner sc=new Scanner(System.in);
	int ch,e;
	obj.createList();
	do
	{
		System.out.println("\n1.InsertLeft\n2.InsertRight\n3.DeleteRight\n4 DeleteLeft\n5.PrintlList\n0.Exit\n:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Element");
			e= sc.nextInt();
			obj.insertLeft(e);
			break;
		case 2:
			System.out.println("Enter Element");
			e= sc.nextInt();
			obj.insertRight(e);
			break;
		case 3:
			obj.deleteRight();
			break;
		case 4:
			obj.deleteLeft();
			break;
		case 5:
			obj.printList();
			break;
		case 0:
			System.out.println("Thanku for see my code...");
			break;
		default :
			System.out.println("good bye");
		}
	} while(ch!=0);
}
}

	