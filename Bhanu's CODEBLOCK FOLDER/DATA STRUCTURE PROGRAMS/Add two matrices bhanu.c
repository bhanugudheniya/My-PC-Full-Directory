#include<stdio.h>
#include<conio.h>

int main()
{
	int r, c, a[100][100], b[100][100], sum[100][100], i, j;

	printf("Enter number of rows (between 1 and 100):\n");
	scanf("%d",&r);

	printf("Enter number of columns (between 1 and 100):\n");
	scanf("%d",&c);

	  /*First Matrix*/

	printf("\nEnter elements of 1st Matrix:\n");

	for(i=0; i<r; ++i)
	 for(j=0; j<c; ++j)
	 {
	 	printf("Enter elements a%d%d:",i+1,j+1);
	 	scanf("%d",&a[i][j]);
	 }

	   /*Second Matrix*/

	printf("Enter elements of 2nd Matrix:\n");

	for(i=0; i<r; ++i)
	 for(j=0; j<c; ++j)
	 {
	 	printf("Enter element a%d%d:",i+1,j+1);
	 	scanf("%d",&b[i][j]);
	 }

	   //Adding Two Matrices

	for(i=0; i<r; ++i)
	 for(j=0; j<c; ++i)
	 {
	 	sum[i][j] = a[i][j] + b[i][j];
	 }

	   //Display The Result

	 printf("\nSum of two matrices is:\n\n");
	  for(i=0; i<r; ++i)
	   for(j=0; j<c; ++j)
	   {
	   	 printf("%d",sum[i][j]);

	   	 if(j==c-1)
	   	 {
	   	 	printf("\n\n");
			}
	   }
	   getch();
	   return 0;

}
