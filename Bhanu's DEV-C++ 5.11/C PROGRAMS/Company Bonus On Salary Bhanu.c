#include<stdio.h>
#include<conio.h>
int main()
{
	int salary,salary1;
	float bonus,b,total;
	
	printf("Enter Employee Salary\n");
	scanf("%d\n",&salary);
	printf("Enter Employee Bonus Percentage\n");
	scanf("%f\n",&bonus);
	
	b = salary*(bonus/100);
	total = b+salary;
	
	printf("Your Salary is = %d\n Your Bonus is = %f\n Total Salary with Bonus is = %f\n",salary,b,total);
	gotoxy(1,200);
	printf("THANK YOU\n HAVE A NICE DAY\n");
	
	getch();
	return 0;
}
