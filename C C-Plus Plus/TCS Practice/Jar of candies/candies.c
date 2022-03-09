#include<stdio.h>

void main(){
    int n = 10, k;
    scanf("%d\n", &k);

    if (k == 0)
    {
        printf("Invalid Input\n");
        printf("Number of candies available : %d\n", n);
    }
    else{
        printf("Number of candies sold : %d\n", k);
        printf("Number of candies availble : %d\n", n-k);
    }
    
}