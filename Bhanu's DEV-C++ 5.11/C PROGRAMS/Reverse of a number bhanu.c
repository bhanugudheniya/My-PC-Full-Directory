#include<stdio.h>
#include<conio.h>
int main()
{
	int i,n,rev=0,d;
	
	printf("Enter a number\n");
	scanf("%d\n",&n);
	
	d=n;
	
	while(n>0)
	{
		i=n%10;
		rev=rev*10+i;
		n=n/10;
	}
	
	printf("The Reverse number of %d is %d\n",d,rev);
	getch();
	return 0;
}
