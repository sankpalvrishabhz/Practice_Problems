//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum;
		System.out.println("\nEnter Elements for array:");
		for( int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("\nEnter Targeted result:");
		int target=sc.nextInt();
		System.out.println("\nResult:");
		for( int i=0; i<size-1; i++ )
		{
			for(int j=1; j<size; j++)
			{
				sum=arr[i]+arr[j];
				if( sum==target)
					System.out.println(i+","+j+" shows targeted result:"+target);
			}
		}
		
	}
}