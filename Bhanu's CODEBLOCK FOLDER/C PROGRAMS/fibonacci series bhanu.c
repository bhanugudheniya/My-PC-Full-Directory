#include<conio.h>
#include<stdio.h>
int main()
{
 int a=0,b=1,num,count,c;

 printf("Enter a number to obtain fibonacci series\n");
 scanf("%d\n",&num);

 printf("The Series of\n");
 printf("%d\n%d\n",a,b);
 printf("\n\n* * * * * * * * * \n\n");

 count=2;
 while(count<num)
 {
  c=a+b;
  a=b;
  b=c;

 printf("%d\n",c);
 count++;
 }
 getch();
 return 0;
}
