package LinkedList;
import java.util.Scanner;
class dnode
{
	int data;
	dnode left,right;
	dnode(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class DoublyLinkedList {
	dnode root;
	public void createList()
	{
		root=null;
	}
	public void insertLeft(int e)
	{
		dnode n=new dnode(e);
		if (root==null)
		{
			root=n;
		}
		else
		{
			n.right=root;
			root.left=n;
			root=n;
		}
		System.out.print("Node insert");
	}
	public void insertRight(int e)
	{
		dnode n=new dnode(e);
		if(root==null)
		{
			root=n;
		}
		else
		{
			dnode t=root;
			while(t.right!=null)
			{
				t=t.right;
			}
			t.right=n;
			n.left=t;
		}
		System.out.print("Node inserted...");
	}
	public void deleteLeft()
	{
		if(root==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			dnode t=root;
			root=root.right;
			if(root!=null)
				root.left=null;
			System.out.print(t.data +"deleted");
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
			dnode t=root;
			dnode t2;
			while(t.right!=null)
			{
				t=t.right;
			}
			if(t!=root)
			{
				t2=t.left;
				t2.right=null;
			}
			else
			{
				root=null;
			System.out.print(t.data +"deleted");
		}
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
				dnode t=root;
			while(t!=null)
			{
				System.out.print(t.data +"-->");
				t=t.right;
			}
			}
		}
		public static void main(String [] args)
		{
			DoublyLinkedList obj=new DoublyLinkedList();
			Scanner sc=new Scanner(System.in);
			int ch,e;
			obj.createList();
			do
			{
				System.out.println("\n1.InsertLeft \n2.InsertRight \n3.DeleteLeft"
						+ " \n4.DeleteRight \n5.PrintList \n0. Exit");
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
