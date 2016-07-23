import java.util.*;
class player115
{
public static void main(String[] argd)
{
	int n,sum=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n>0)
	{
		int m=n%10;
		sum+=(m*m);
		n=n/10;
	}
	System.out.println(sum);
}
}
