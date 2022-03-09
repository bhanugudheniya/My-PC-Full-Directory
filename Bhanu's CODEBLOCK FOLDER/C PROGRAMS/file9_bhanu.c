/*Lecture 33*/
/*Reading from a file Using fscanf function in C */
/*fscanf() function is used to read formatted content from file.*/
/* *** int fscanf(FILE *Stream, const char *format,....); *** */
/*Reads data from the stream and stores them according to the parameters format into the locations pointer by the additional
  arguments*/
/* ****Write a program to read content from a file and displaying on the screen. Use fscanf() to read content from the file.**** */
/*********************************************************************************************************************************/

#include<stdio.h>

int main()
{
    FILE *fp;
    int a, b, c;
    fp = fopen("f1.txt","r");
    fscanf(fp, "%d,%d,%d", &a, &b, &c);
    printf("a = %d  b = %d  c = %d", a, b, c);
    fclose(fp);
}
