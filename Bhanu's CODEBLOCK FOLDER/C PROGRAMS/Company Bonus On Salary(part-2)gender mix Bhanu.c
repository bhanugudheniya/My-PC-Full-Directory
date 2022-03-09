#include<stdio.h>
#include<conio.h>
int main()
{
 int i,j;
 float salary,bonus;
 char gender;
 printf("Enter M for Male and F for Female\n");
 scanf("%c\n",&gender);
 printf("Enter Your Salary\n");
 scanf("%d\n",&salary);

 if(gender=='M'||gender=='m')
  {
   if(salary>10000)
   bonus = (float)(salary*0.05);
   else
   bonus = (float)(salary*0.07);
  }
else
  if(gender=='F'||gender=='f')
  {
   if (salary>10000)
   bonus = (float)(salary*0.1);
   else
   bonus = (float)(salary*0.12);
  }
  salary+=bonus;  //salary = salary+bonus

  printf("Bonus = %f\n Salary = %f\n",bonus,salary);
  getch();
  return 0;
  }
