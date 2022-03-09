#include<stdio.h>
#include<conio.h>
int main()
{
 int a,b,c,d;
 printf("Enter three numbers\n");
 scanf("%d\n%d\n%d\n",&a,&b,&c);
 d = a>b?(a>c?a:c):(b>c?b:c);
 printf("%d\n",d);
 getch();
 return 0;
}
