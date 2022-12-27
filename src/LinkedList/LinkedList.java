package LinkedList;
public class LinkedList 
{
	static class Node
	{
		int data=0;
		Node next=null;
		
		Node(int data)
		{
			this.data=data;
		}
		Node()
		{

		}
		Node(int data, Node next)
		{
			this.data=data;
			this.next=next;
		}

	}


	public static Node head=null;   //pointer
	public static Node tail = null;
	public static Node curr= null;
	public static Node curr1=null;

	public static void addstart(int data)
	{

		Node newnode= new Node(data); // creating a new node

		if(head==null)  
		{
			head=newnode;  //stop pointing to null and start pointing to newnode
			tail=newnode;  //stop pointing to null and start pointing to newndoe

		}
	
		else
		{
			newnode.next=head;   // new nodes address is going to point the head
			head = newnode;      //shifting head to newly created node

		}  
	}

	public static void addlast(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		
		}
		else
		{
		tail.next=newnode;
		tail=newnode;
		}
	}

	public static void addmid(int data, int k)
	{
		Node newnode = new Node(data);				//create a node,
		
		Node curr=head;							//save further list,create connection btn nodes
		k--;
		while(k!=0)
		{
			curr=curr.next;
			k--;

		}
	}

	public static void display ()
	{
		System.out.println("entered linked list is");
        for (Node temp=head;temp!=null;
        		temp=temp.next){
            System.out.println(temp.data+" ");
        }
        System.out.println();
		
	}
	public static void main(String[] args) {
		addstart(10);
		addlast(20);
		addstart(25);
		addstart(10);
		addlast(20);
		addstart(25);
		addmid(5,2);
		display();
		
	}

}