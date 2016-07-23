import java.util.*;
class player99
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	long isbn,sum=0;
	isbn=s.nextLong();
	long m=isbn;
	for(int i=1;i<=10;i++)
	{
		long n=isbn%10;
		sum+=(n*i);
		isbn=isbn/10;
	}
	if(sum%11==0)
		System.out.println(m + " is an isbn number");
	else
		System.out.println(m + " is not an isbn number");
}
}
