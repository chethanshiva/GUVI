import java.util.*;
class player75
{
public static void main(String[] args)
{
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			int temp=0;
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int count=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			System.out.println(a[i] + "," + a[j]);
			count+=1;
		}
	}
	System.out.println("the number of pairs are:"+count);
}
}
