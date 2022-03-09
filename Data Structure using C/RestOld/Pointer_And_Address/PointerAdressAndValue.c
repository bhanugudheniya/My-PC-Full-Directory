#include<stdio.h>
#include<stdlib.h>

void main(){
    int a = 5;
    int *b;
    b = &a;

    printf("Value of a is %d\n", a);
    printf("Value of a is %d\n", *(&a));
    printf("Value of a is %d\n", *b);

    printf("Address of a is %d\n", &a);
    printf("Address of a is %d\n", b);

    printf("Address of b is %d\n", &b);

    printf("Value of b is %d\n", b);
}