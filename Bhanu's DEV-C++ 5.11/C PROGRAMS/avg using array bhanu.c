#include<stdio.h>
#include<conio.h>
int main()
{
	int a[10],i,sum=0;
	float avg;

	
	printf("Enter 10 numbers\n");
	for(i=0; i<=9; i++)
	scanf("%d\n",&a[i]);
	
	for(i=0; i<=9; i++)
	sum=sum+a[i];
	
	avg=sum/10.0;
	printf("Average is %d\n",avg);
	
	getch();
	return 0;
}
