#include<stdio.h>
#include<conio.h>
void BubbleSortRecursion(int a[],int num);
int main()
{
	int i,j,num,temp;
	printf("Enter number of element\n");
	scanf("%d\n",&num);
	int a[num];
	printf("Enter numbres\n");
	for(i=0;i<num;i++)
	{
		scanf("%d\n",&a[i]);
	}

	BubbleSortRecursion(a,num);
	printf("Ascending Order Of Given Number\n");

	for(i=0; i<num; i++)
	{
		printf("%d\n",a[i]);
	}
	}

	void BubbleSortRecursion(int a[], int num)
	{
		int i,j,temp;
		i=num;

		if(i>0)
		{
			for(j=0; j<num-1; j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;

				}
			}
			BubbleSortRecursion(a,num-1);
		}
		else
		{
			return;
		}
	}

