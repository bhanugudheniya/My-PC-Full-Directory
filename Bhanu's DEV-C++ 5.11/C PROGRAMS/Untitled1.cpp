#include<stdio.h>
#include<conio.h>
int main()
{
	int a,b;
	printf("Enter a number\n");
	scanf("%d\n",&a);
	
	for(b=0; b<=a; b++)
	{
	
	  if(a%2==1)
	   
	   	printf("%d\n",b);
	   	else
	   	continue;
	   }
	   printf("\n");
	   getch();
	
}
