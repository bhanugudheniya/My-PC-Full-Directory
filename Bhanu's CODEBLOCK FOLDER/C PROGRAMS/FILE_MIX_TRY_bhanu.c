
#include<stdio.h>

int main()
{
    char str[20];
    char m;
    printf("Enter Mode {w = writing, r = reading, a = append\n");
    scanf("%c\n",&m);
    FILE *fp;
    fp = fopen("f1.txt","%c",m);  /*  a = append;  w = writing;  */

    if(m==w)
    {
    printf("Enter Your Name\n");
    gets(str);
    fputs(str,fp);
    }

    else
        if(m==r)

         while(fgets(str,9,fp)!=NULL)
    {
        printf("%s ",str);
    }

    else
        if(m==a)
    {
    printf("Enter Your Name\n");
    gets(str);
    fputs(str,fp);
    }
    fclose(fp);
}
