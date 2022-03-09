#include<stdio.h>
#include<conio.h>
int main()
{
	int i,n,fact=1;
	
	printf("Enter a Number\n");
	scanf("%d\n",&n);
	
	for(i=1; i<=n; i++)
	{
		fact=fact*i;
	}
	printf("Factorial of %d is %d\n",n,fact);
	getch();
	return 0;
}
