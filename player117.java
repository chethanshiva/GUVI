import java.util.*;
class player117
{
public static void main(String[] args)
{
	String str=new String();
	Scanner s=new Scanner(System.in);
	str=s.next();
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(str.charAt(i) + "-");
	}
}
}
