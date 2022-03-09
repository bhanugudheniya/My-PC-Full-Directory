/*
There is no index out of bounds in checking in c/c++, for example, the following programs compiles fine but may produce unexpected output when run.
*/

// This program compiles fine as index out of bound is not checked .

#include<stdio.h>

void main()
{
    int arr[2];

    printf("%d\n", arr[3]);
    printf("%d", arr[-2]);
}