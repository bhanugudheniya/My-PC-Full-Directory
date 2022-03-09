#include<stdio.h>
#include<conio.h>
int main()
{
	int a=0,b=1,c,count,num;
	
	printf("Enter a number to obtain fibonacci series\n");
	scanf("%d\n",&num);
	printf("The series of\n");
	printf("%d\n%d\n",a,b);
	printf("* * * * * * * * * * * * \n");
	count=2;
	while(count<num)
	{
		c=a+b;
		a=b;
		b=c;
	
	printf("%d\n",c);
	count++;
}
}
