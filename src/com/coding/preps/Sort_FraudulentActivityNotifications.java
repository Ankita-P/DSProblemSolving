package com.coding.preps;

public class Sort_FraudulentActivityNotifications {
	public static void main(String[] args)
	{
		int[] expenditure = {1,2,3,4,8};
		int d = 4;
		int count = 0;
		
		for(int i = d; i <expenditure.length; i++)
		{
			int start = i-d;
			int end = i-1;
			double median =0;
			System.out.println(start +" - "+end);
			if(d%2 == 0)
			{
				int medEnd = i/2;
				int medStart = medEnd -1;
				System.out.println("med start, end" + medStart +" "+ medEnd);
				
					median = (double)(expenditure[medEnd] + expenditure[medStart])/2;
					System.out.println("median = "+median);
			}
			else
			{
				median = expenditure[(end-start/2)-1];
			}
			
			System.out.println("median = "+median);
			if(expenditure[i] >= 2*median)
			{
				count++;
			}
			
			System.out.println("Count "+count);
		}
		
		System.out.print(count);
	}
}
