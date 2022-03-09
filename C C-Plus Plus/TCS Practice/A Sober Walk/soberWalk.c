#include<stdio.h>
#include<stdlib.h>

void main(){
    int n, x=0, y=0;
    char c = 'R';

    scanf("%d\n", &n);

    while (n)
    {
        switch (c)
        {
        case 'R':
            x = abs(x)+10;
            // printf("%d\n", x);
            y = abs(y);
            // printf("%d\n", y);
            c = 'U';
            break;
        
        case 'U':
            y = y+20;
            c = 'L';
            break;

        case 'L':
            x = -(x+10);
            c = 'D';
            break;

        case 'D':
            y = -(y);
            c = 'R';
            break;

        default:
            break;
        }
        n--;
    }
    printf("%d %d\n", x, y);
}