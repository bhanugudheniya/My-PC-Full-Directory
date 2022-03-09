#include<stdio.h>
#include<conio.h>
int main()
{
int i,n;

printf("Enter values\n");
scanf("%d\n",&n);
for(i=1; i<=n; i++)
{
    printf("======================\n");
    printf("==        %d       ==\n",i*i);

    printf("======================\n");
    printf("\n\n\n\n");
}
getch();
return 0;
}
