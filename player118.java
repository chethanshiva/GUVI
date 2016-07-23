import java.util.*;
class player118
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String str=new String();
	int max=0,n=0;
	str=s.nextLine();
	String words[]=str.split(" ");
	for(int i=0;i<words.length;i++)
	{
		int len=words[i].length();
		if(max<len)
		{
			max=len;
			n=i;
		}
	}
	System.out.println(words[n]);
}
}
