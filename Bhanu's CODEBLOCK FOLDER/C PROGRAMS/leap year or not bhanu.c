#include<conio.h>
#include<stdio.h>
int main()
{
 int n;
 printf("Enter a Year\n");
 scanf("%d\n",&n);

 if(n%400==0)
  {
   printf("It is Leap year\n");
  }
    else
 if(n%100==0)
  {
   printf("It is not a Leap year\n");
  }
    else
 if(n%4==0)
 {
   printf("It is a Leap Year\n");
 }
 else
 {
   printf("It is not a Leap Year\n");
 }
 getch();
 return 0;
     }
