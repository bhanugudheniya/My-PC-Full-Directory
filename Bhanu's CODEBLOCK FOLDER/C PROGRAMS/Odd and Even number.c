#include<conio.h>
#include<stdio.h>
int main()
{
int a;
printf("Enter a number\n");
scanf("%d\n",&a);

if(a%2==0)
{
  printf("%d is a even number\n",a);
  }
  else
  {
  printf("%d is a odd number\n",a);
  }
  getch();
  return 0;
}
