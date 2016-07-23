import java.util.*;
class player61
{
public static void main(String ards[])
{
	int n,x;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	x=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0,j=i+1;i<n-1;i++,j++)
	{
	//	System.out.println(i +","+ j);
		int sum=a[i]+a[j];
		if(sum==x)
		{
			System.out.println(a[i] +"," + a[j]);
		}
	}
}
}
