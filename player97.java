import java.util.*;
class player97
{
public static void main(String[] args)
{
	int n,sum=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=0;i<=n;i++)
	{
		if(i%2!=0)
			sum+=i;
	}
	System.out.println("the sum of odd numbers in a range " + n + " is " + sum);
}
} 
