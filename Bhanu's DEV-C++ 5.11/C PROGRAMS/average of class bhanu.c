#include<stdio.h>
#include<conio.h>
int main()
{
 int i,j,num,sum=0;
 float avg;

 printf("Enter numbers of students in class\n");
 scanf("%d\n",&num);
 int marks[num];
 printf("Enter marks of all students\n");
 for(i=0;i<=num;i++)
 {
  scanf("%d\n",&marks[i]);
  sum+=marks[i];
 }
 avg=(float)avg/num;
 printf("Average of class is %d\n",avg);

 getch();
 return 0;

}

