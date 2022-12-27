package BinarySearch;
public class BinarySearch1 {
	public static void main(String [] args)
	{
		int [] num= {22,23,34,56,78,90};
		int target=78;
		System.out.println(search(num,target));
	}
	static int search(int[] num,int target)
	{
		int start=0;
		int end=num.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(num[mid]>target)
				end=mid-1;
			else if (num[mid]<target)
				start=mid+1;
			else
				return mid;
		}
		return-1;
	}

}


