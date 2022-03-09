#include<stdio.h>
#include<conio.h>
int main()
{
	int a[100],i,n,se=0,so=0;
	printf("Enter Numbers of elements\n");
	scanf("%d\n",&n);
	printf("Enter numbers\n");
	for(i=0;i<=n;i++)

		scanf("%d\n",&a[i]);

 for(i=0;i<=n8;i++)
	if(a[i]%2==0)

		se+=a[i];

	else

		so+=a[i];


	printf("even is %d\n",se);
	printf("odd is %d\n",so);
	getch();
	return 0;

}
