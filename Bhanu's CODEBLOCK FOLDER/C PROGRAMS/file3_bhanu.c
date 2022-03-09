/*Lecture 27*/
/*Reading from a file*/
/*******************************************************************************************************************************/

#include<stdio.h>

int main()
{
    char ch;
    FILE *fp;
    fp = fopen("f1.txt","r");

    if(fp==NULL)
    {
        printf("File not Found\n");
        exit(1);
    }

    ch = fgetc(fp);  /*return the characters from the file*/

    while(!feof(fp)) /*feof = ********end of file******** // this is loop which is running till the all the characters in the
                       file will not end*/
    {
        printf("%c",ch);
        ch=fgetc(fp);
    }
    fclose(fp);
    getch();
}
