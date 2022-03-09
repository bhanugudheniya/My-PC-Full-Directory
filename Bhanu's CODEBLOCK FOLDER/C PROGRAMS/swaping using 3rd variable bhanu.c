#include<stdio.h>
#include<conio.h>
int main()
{
int a,b,c;
printf("Enter two numbers\n");
scanf("%d\n%d\n",&a,&b);

printf("The value of A is %d and value of B is %d before swaping\n",a,b);
 c=a;
 a=b;
 b=c;
 printf("The value of A is %d and value of B is %d after swaping\n",a,b);
 getch();
 return 0;
}
