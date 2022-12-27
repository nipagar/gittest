package Graph;
import java.util.Scanner;
public class GraphDemo {
	int v,visited[],g[][];
	boolean flag=false;
	void createGraph(int nodes)
	{
		v=nodes;
		Scanner sc = new Scanner(System.in);
		g=new int [v][v];
		visited=new int[v];
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
			System.out.print("Enter value for v" +i+ " to v" +j+" ");
			g[i][j]=sc.nextInt();
			}
		}
	}
	void printGraph()
	{
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(g[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void resetvisited()
	{
		for(int i=0;i<v;i++)
		{
			visited[i]=0;
		}
	}
	public void DFS(int source)
	{
		visited[source]=1;
		System.out.println("v"+source);
		for(int i=0;i<v;i++)
		{
			if(g[source][i]==1 && visited[i]!=1)
			{
				DFS(i);
			}
		}
	}
public  boolean DFS_search(int source,int key)
{
	if(key==source)
	{
		flag=true;
	}
	visited[source]=1;
	System.out.println("v"+source);
	for(int i=0;i<v;i++)
	{
		if(g[source][i]==1 && visited[i]!=1)
		{
			DFS_search(i,key);
		}
	}
	return(flag);
}
public static void main(String args[])
{
	GraphDemo obj=new GraphDemo();
	obj.createGraph(4);
	obj.printGraph();
	obj.resetvisited();
	System.out.println("DFS");
	if(obj.DFS_search(0, 1)==true)
	System.out.println("Found");
	else
		System.out.println("Not found");
}
}
