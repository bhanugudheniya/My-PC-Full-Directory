#include<stdio.h>
#include<conio.h>

int main()
{

  /*2D Array Declaration*/

int disp[2][3];

  /*Counter Variable for the loop*/

int i,j;
for(i=0; i<2; i++)
 {
 	for(j=0; j<3; j++)
 	{
 		printf("Enter Value of disp[%d] [%d]:",i,j);
 		scanf("%d",&disp[i][j]);
	 }
  } 
  
  /*Displaying array elements*/
  
printf("Two array elements:\n");
for(i=0; i<2; i++)
{
	for(j=0; j<3; j++)
	{
		printf("%d ",disp[i][j]);
		if(j==2)
		{
			 printf("\n");
		}
	}
}

getch();
return 0;
}
