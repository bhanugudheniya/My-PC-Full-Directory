/* This is program of insertion the data at the end of an array
   it is self design by BHANU GUDHENIYA*/
/* in this program is code is writing with guidelines of query*/
#include<stdio.h>
#include<conio.h>
int main()                                  /* start main body*/
{
int n,i,A[100],a;                           /* declare the variables*/

printf("Enter size of array:\n");           /* print the statement"Enter size of array" */
scanf("%d\n",&n);                           /* insertion of size of array and get the value of size of array from user */

printf("Insert element in array:\n");       /* print the statement"insert elements in array */
for(i=0;i<=n;i++)                           /* start a for loop for get a space in memory location of inserted data*/
 {
  scanf("%d\n",&A[i]);                      /* insertion data in array and assign a memory location in an array*/
 }
 printf("Insert new element in array:\n");  /* print the statement"insert new element in array than insert the new data */
 scanf("%d\n",&a);                          /* get the new data */
 A[i]=A[i]+a;                               /* start a operation that is "A[i]=A[i]+a" for add a new data in array*/

 printf("The new array is:\n");             /* print the statement"the new array is:"*/
 for(i=0;i<=n;i++)                          /* start a for loop for display all elements of an array one by one*/
 {
  printf("%d\n",A[i]);                      /* display new array*/
 }
 getch();                                   /* for holding the output display*/
 return 0;                                  /* after all the process, the program comes from the output display mode*/
 }
