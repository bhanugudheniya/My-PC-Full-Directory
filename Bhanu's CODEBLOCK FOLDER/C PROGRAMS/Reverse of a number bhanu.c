#include<stdio.h>
#include<conio.h>
int main()
{
 int i,rev=0,n,d;

 printf("Enter a number\n");
 scanf("%d\n",&n);
  d=n;

  while(n>0)
  {
   i=n%10;
   rev=rev*10+i;
   n=n/10;
  }
  printf("The Reverse of %d is %d\n",d,rev);
  getch();
  return 0;
}
