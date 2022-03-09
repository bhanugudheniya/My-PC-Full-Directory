/*Lecture 30*/
/*Writing  file Using fwrite() function in C*/
/*fwrite() function is used to write content to the file in binary Mode*/
/* **** int fwrite(void *BUFFER, int size, int Count, File *ptr); **** */
/******************************************************************************/

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
    fp = fopen("myfile.dat","ab");  /* ab = append + binary */
    printf("Enter bookid, title and price\n");
    scanf("%d\n", &b1.bookid);
    fflush(stdin);   /*flush the buffer*/
    gets(b1.title);
    scanf("\n%f\n", &b1.price);

    fwrite(&b1, sizeof(b1),1, fp);
    fclose(fp);
}
