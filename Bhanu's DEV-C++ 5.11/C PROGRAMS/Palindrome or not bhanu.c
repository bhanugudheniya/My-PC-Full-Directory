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
	
	printf("The Reverse of %d is %d\n",d,rev);
	
	/*if-else condition is started*/
	
	if(d==rev)
	{
		printf("It is a Palindrome Number\n");
	}
	else
	{
		printf("It is not a Palindrome Number\n");
	}
	
	/*Comment for user*/
    
	printf("\n\n********************************\nThank You For Using This Program\n");

	getch();
	return 0;
}

