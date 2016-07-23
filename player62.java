/*
   Given a number find the min number which divide the given number and the min number must be odd number
input:18
output:3
input:11
output:11
*/
import java.util.*;
class player62
{
public static void main(String ards[])
{
	int n,number=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int count=0;
		for(int num=n;num>0;num--)
		{
			if(n%num==0)
			{
				count+=1;
				int min=num;
				if(min!=1 && min%2!=0)
					number=min;
			}
		}
	if(count==2)
		System.out.println(n);
	else
		System.out.println(number);
}
}
