/*Lecture 28*/
/*Reading from the File Using fgets() [FILE GET STRING] in C*/

/*fgets() is a function to read string from a file*/
/*-********fgets(str,number of records[n], fp)*********-*/
/***********************************************************************/

#include<stdio.h>

int main()
{
    char str[10];
    FILE *fp;

    fp = fopen("f1.txt","r");

    if(fp==NULL)
    {
        printf("File Not Found\n");
        exit(1);
    }

    while(fgets(str,9,fp)!=NULL)
    {
        printf("%s",str);
    }
    fclose(fp);
}
