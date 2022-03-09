/*Lecture 31*/
/*Reading from a file Using fread in C */
/*fread() function is used to read content from a file in binary mode*/
/* *** int fread(void *BUFFER, int size, int Count, File *ptr); *** */

/* **** write a program to read content from a file and display on the screen. Use fread() to read content from the file. **** */

/*******************************************************************************************************************************/

#include<stdio.h>

struct book
{
    int bookid;
    char title[20];
    float price;
};

void main()
{
    struct book b1;
    FILE *fp;
    fp = fopen("myfile.dat","rb"); /* ** r = read; * b = binary; ** */

    if(fp==NULL)
    {
        printf("File Not Found\n");
        exit(1);
    }

    while(fread(&b1, sizeof(b1),1,fp)>0);
    {
        printf("%d %s %f\n", b1.bookid, b1.title, b1.price);
    }
    fclose(fp);
}
