#include<stdio.h>
#include<conio.h>
int main()
{
	int num1,num2,sum=0,i;

	printf("Enter Number 1\n");
	scanf("%d\n",&num1);
	printf("Enter Number 2\n");
	scanf("%d\n",&num2);

	for(i=num1; i<=num2; i++)
	{
		if(i%2==0)
		{
			sum+=i;
		}
	}
	printf("The Sum of all Integers divisible by 2 between %d and %d is %d\n",num1,num2,sum);
	getch();
	return 0;
	}
