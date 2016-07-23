import java.util.*;
class player119
{
public static void main(String args[])
{
	int n1,n2,sum1=0;;
	Scanner s=new Scanner(System.in);
	n1=s.nextInt();
	n2=s.nextInt();
	for(int i=n1;i<=n2;i++)
	{
		int j=i;
		int sum=0;
		while(j>0)
		{
			int k=j%10;
			sum=sum*10+k;
			j=j/10;
		}
		if(sum==i)
		{
			sum1+=sum;
			System.out.println("the palindromes are: " + sum);
		}	
	}
	System.out.println("sum is: " + sum1);
}
}		
