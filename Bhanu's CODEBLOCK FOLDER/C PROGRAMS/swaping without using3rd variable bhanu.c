#include<stdio.h>
#include<conio.h>
int main()
{
int a,b;
printf("Enter two number\n");
scanf("%d\n%d\n",&a,&b);

printf("The value of A is %d and value of B is %d before swaping\n",a,b);

a=a+b;
b=a-b;
a=a-b;
printf("The value of A is %d and value of B is %d after swaping\n",a,b);
getch();
return 0;
}
