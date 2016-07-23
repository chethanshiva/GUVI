/*reverse an array in subset of N
input:[1,2,3,4,5,6,7,8,9]
output:[3,2,1,6,5,4,9,8,7]
*/
#include<stdio.h>
main()
{
	int n,N,i,j,size,count=0,N1=0;
	scanf("%d %d",&n,&N);
	N1=N;
	int arr[n],brr[n];int a=0,b=0;
	size=n/N;
	printf("%d",size);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("%d",arr[i]);
	}
	printf("\n");
	for(i=n-1;i>=0;i--)
	{
		printf("%d",arr[i]);
	}
	printf("\n");
	for(i=0;i<size;i++)
	{
		a=N;
		for(j=a-1;j>=b;j--)
		{
			brr[count++]=arr[j];
		}
		b+=N1;
		N+=N1;
	}
	for(i=0;i<count;i++)
	{
		printf("%d",brr[i]);
	}
}

