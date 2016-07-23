import java.util.*;
class player96
{
public static void main(String[] args)
{
	int n,first=0,last=-1,m;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	m=n;
	while(n>0)
	{
		if(last==-1)
		{
			last=n%10;
			first=last;
			n=n/10;
		}
		else
		{
			last=n%10;
			n=n/10;
		}
	}
	int sum=first+last;
	System.out.println("the sum of first and last digit of "+m+" is "+sum);
}
}
