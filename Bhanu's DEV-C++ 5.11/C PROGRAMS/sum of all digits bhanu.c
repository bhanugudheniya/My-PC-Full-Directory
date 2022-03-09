#include<conio.h>
#include<stdio.h>
int main()
{
	int i,n,d,sum=0;
	
	printf("Enter a number\n");
	scanf("%d\n",&n);
	d=n;
	while(n>0)
	{
		i=n%10;
		sum=sum+i;
		n=n/10;
	}
	
	printf("The sum of all digits in %d is %d\n",d,sum);
	getch();
	return 0;
	}
