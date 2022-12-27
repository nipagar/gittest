package Tree;
import java.util.Scanner;
 class Node
{
	int key;
	Node left ,right;
	public Node (int item)
	{
		key=item;
		left=right=null;
	}
}
public class TreeExample {
	Node root;
	static int count;
	TreeExample()
	{
		root=null;
	}
	public void insert(Node r, Node n)
	{
		if(root==null)
		{
			root=n;
		}
		else
		{
			if(n.key<r.key)
			{
				if(r.left==null)
				r.left=n;
				else
					insert(r.left,n);
			}
			else
			{
				if(r.right==null)
					r.right=n;
				else
					insert(r.right,n);
			}
		}
	}
	public void inorder(Node r)
	{
		if(r!=null)
		{
			inorder(r.left);
			System.out.println(r.key);
			inorder(r.right);
		}
	}
	public void counter(Node r)
	{
		if(r!=null)
		{
			counter(r.left);
			if(r.left==null && r.right==null)
				TreeExample.count++;
			counter(r.right);
		}
	}
	public static void main(String args[])
	{
		TreeExample t= new TreeExample();
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		
		t.insert(t.root,n1);
		t.insert(t.root,n2);
		t.insert(t.root,n3);
		t.insert(t.root,n4);
		t.insert(t.root,n5);
		t.insert(t.root,n6);
		t.inorder(t.root);
		TreeExample.count=0;
		t.counter(t.root);
		System.out.println("Total nodes:"+TreeExample.count);
	}
}
		