#include<stdio.h>
#include<stdlib.h>

void main()
{
    int a = 5;
    int *b;
    int **c;

    b = &a;
    c = &b;

    // Value of a is 5
    printf("Value of a is %d\n", a);
    printf("Value of a is %d\n", *(&a)); 
    printf("Value of a is %d\n", *b); 
    printf("Value of a is %d\n", **c); 

    printf("\n");

    // Value of b is Address of a; in this pc address of a is 2686684
    printf("Value of b is %d\n", b); 
    printf("Value of b is %d\n", *(&b)); 
    printf("Value of b is %d\n", *c); 

    printf("\n");

    // Value of c is Address of b; in this pc address of b is 2686680
    printf("Value of c is %d\n", c); 
    printf("Value of c is %d\n", *(&c));

    printf("\n");

    // Address of a is comes from many ways...
    printf("Address of a is %d\n", b);
    printf("Address of a is %d\n", *c); 
    printf("Address of a is %d\n", &a); 

    printf("\n");

    // Address of b is comes from many ways...
    printf("Address of b is %d\n", &b); 
    printf("Address of b is %d\n", c); 

    printf("\n");

    // Address of  c is comes from many ways...
    printf("Address of c is %d\n", &c); 




}