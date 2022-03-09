/*Lecture 32*/
/*Writing in a file Using fprintf function in C */
/*fprintf() function is used to write formatted output to the specified  stream*/
/* *** int fprintf(FILE *stream, const char *format, [argument ....]); *** */
/* *** fprintf(fp,"\nSum od %d and %d is %d", a, b, c); *** */
/* ****Write a program to write content to a file. use fprintf() to write content to the file. **** */
/****************************************************************************************************/

#include<stdio.h>

int main()
{
    FILE *fp;
    int a,b;
    fp = fopen("f1.txt","w");
    printf("Enter two numbers\n");
    scanf("%d %d", &a, &b);
    fprintf(fp,"Sum of %d and %d is %d", a, b, a+b);
    fclose(fp);
}
