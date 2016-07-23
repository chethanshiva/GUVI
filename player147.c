/*print the count of duplicate char in a given string in same order
input:abbaccdbac
output:a3b3c3d1
*/
#include<stdio.h>
#include<string.h>
main()
{
	char ch[20];
	int len,i,j;
	int times;
	int cn=0,count=0,flag=0;
	gets(ch);
	len=strlen(ch);
	char noc[len];
	//printf("%d\n",len);
	//puts(ch);
	for(i=0;i<len;i++)
	{
		if(i==0)
			noc[count++]=ch[i];
		else
		{
			int cn=count;
			for(j=0;j<cn;j++)
			{
				if(noc[j]==ch[i])
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
				noc[count++]=ch[i];
		}
	}
	/*for(i=0;i<count;i++)
	{
		printf("%c\n",noc[i]);
	}*/
	for(i=0;i<count;i++)
	{
		times=0;
		for(j=0;j<len;j++)
		{
			if(noc[i]==ch[j])
			{
				times++;
			}
		}
		printf("%c%d",noc[i],times);
	}
}


