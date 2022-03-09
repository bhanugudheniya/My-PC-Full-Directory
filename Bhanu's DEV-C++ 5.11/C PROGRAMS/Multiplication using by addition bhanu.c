#include<stdio.h>
#include<conio.h>
int main()
{
	int a,b,i,m=0;
	printf("Enter a and b\n");
	scanf("%d\n%d\n",&a,&b);
	if(b<0)
	{
		a=a+b;
		b=a-b;
		a=a-b;
	}
	if(a>=0)
	 {
	 	for(i=1;i<=a;i++)
	 	m+=b;
	 }
	 if(a<0)
	 {
	 for(i=a;i<=a;i++)
	 m-=b;
     }
     printf("Multiplication = %d\n",m);
     getch();
     return 0;
}
