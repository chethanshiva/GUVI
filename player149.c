import java.util.*;
class player149
{ 
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str=new String();
	str=s.nextLine();
	String[] words=str.split(" ");
	int len=words.length();
	for(int i=0;i<len;i++)
	{
		int len2=words[i].length();
		System.out.println(len2);
	}
}
}	
