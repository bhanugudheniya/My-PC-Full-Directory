#include<stdio.h>

void main()
{
    int LA[] = {1,2,3,4,5,6};
    int item = 10, index = 3, size = 5;
    int i = 0, indexTemp = size;

    printf("Original Array\n");

    for (i = 0; i < size; i++)
    {
        printf("LA[%d] = %d \n", i, LA[i]);
    }

    // size = size + 1;
    size += 1;

    while(indexTemp >= index)
    {
        LA[indexTemp+1] = LA[indexTemp];
        // indexTemp = indexTemp - 1;
        indexTemp -= 1;
    }

    LA[index] = item;

    printf("Array after Insertion\n");

    for (i = 0; i < size; i++)
    {
        printf("LA[%d] = %d\n", i, LA[i]);
    }
}