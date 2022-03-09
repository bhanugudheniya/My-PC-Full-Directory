#include<iostream.h>                //declaration of cin and cout
#include<conio.h>                   //declaration of clrscr() and getch()

void main()
{
 clrscr();                          //ACTION STATEMENT

 int x;                             //Declaration after ACTION STATEMENT
 cout<<"Enter a number"<<endl;      //ACTION STATEMENT
 cin>>x;                            //ACTION STATEMENT
 int s=x*x;                         //Dyanamic initialization
 cout<<"Square of" <<x <<"is" <<s;  //ACTION STATEMENT
 getch();                           //ACTION STATEMENT
}
