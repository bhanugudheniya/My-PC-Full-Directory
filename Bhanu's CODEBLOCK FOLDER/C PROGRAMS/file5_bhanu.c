/*Lecture 29*/
/*Writing in a file Using fputs [FILE PUT STRING] in C*/
/*fputs(str,fp)*/
/*********************************************************************/

#include<stdio.h>

int main()
{
    char str[20];
    FILE *fp;
    fp = fopen("f1.txt","w");  /*  a = append;  w = writing;  */

    printf("Enter Your Name\n");
    gets(str);
    fputs(str,fp);
    fclose(fp);
}
