#include<stdio.h>
void main()
{

int arr[ 10 ];
int i, j;
    for (i = 0; i<10; i++)
    {
        arr[i] = i + 100;
    }
    
    for (j = 0; j<10; j++)
    {
        printf("Element [%d] = %d\n",j, arr[j]);
    }
       
}