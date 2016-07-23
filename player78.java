import java.util.*;
class player78
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n,min=0,diff=0;
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int m1=0,m2=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(j==1)
			{
				min=Math.abs(a[i]-a[j]);
				m1=i;
				m2=j;
			}	
			else
			{
				diff=Math.abs(a[i]-a[j]);
				if(min>diff)
				{
					min=diff;
					m1=i;
					m2=j;
				}
			}
		}
	}
	System.out.println("the minimum difference is " + min + " between " +   a[m1] + " and " + a[m2]);
}
}
