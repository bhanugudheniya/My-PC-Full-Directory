#include<conio.h>
#include<stdio.h>
int main()
{
int i,n;
printf("Enter a number\n");
scanf("%d\n",&n);

for(i=0; i<=n; i++)
{
    if(i%2==1)
        printf("%d\n",i);
    else
        continue;

}
printf("\n");
getch();
return 0;
}
