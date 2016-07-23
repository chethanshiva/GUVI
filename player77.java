import java.util.*;
class player77
{
public static void main(String[] args)
{
	int n,count=0,count1=0,max=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]>=max)
		{
			max=a[i];
			count1++;
		}
		else
		{
			max=a[i];
			if(count<count1)
				count=count1;
			count1=1;
		}
	}
	System.out.println("the maximum length of increasing order is:"+count);
}
}
