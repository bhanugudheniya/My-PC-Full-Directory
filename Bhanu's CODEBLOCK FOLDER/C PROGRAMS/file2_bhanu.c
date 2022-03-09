/*Lecture 25*/
/*Writing in a file*/
/**********************************/

#include<stdio.h>
#include<conio.h>

int main()
{
 int i;
 FILE *fp;
 char s[100];
 fp = fopen("f1.txt","w");

  if(fp==NULL)
  {
   printf("File cannot open");
   exit(1);
  }
  printf("Enter a String\n");
  gets(s);

  for(i=0; i<strlen(s); i++)
   fputc(s[i],fp);
  getch();
  fclose(fp);
  getch();
}
