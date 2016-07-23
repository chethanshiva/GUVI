import java.util.*;
class player76
{
public static void main(String[] args)
{
	int n,k=0,k1=0,count=0,count1=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		if(a[i]%2==0)
		{
			count+=1;
			k=i;
		}
		else
		{
			count1+=1;
			k1=i;
		}	
	}
	if(count==1)
		System.out.println("the different number is:"+a[k]);
	else
		System.out.println("the different number is:"+a[k1]);
}
}
