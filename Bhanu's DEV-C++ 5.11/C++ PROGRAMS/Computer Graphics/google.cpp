#include<iostream>

#include<graphic.h>
#include<math>
using namespace std;

void main()
{
int g=0,d;
initgraph(&g,&d,"c:\turboc3\bgi");
setbkcolor(15);
setcolor(1);
settextstyle(3,0,5);
outtextxy(190,140,"G");
setcolor(4);
settextstyle(3,0,5);
outtextxy(220,140,"O");
setcolor(3);
settextstyle(3,0,5);
outtextxy(250,140,"O");
setcolor(1);
settextstyle(3,0,5);
outtextxy(280,140,"G");
setcolor(2);
settextstyle(3,0,5);
outtextxy(310,140,"L");
setcolor(4);
settextstyle(3,0,5);
outtextxy(340,140,"E");
setcolor(1);
settextstyle(3,0,5);
setcolor(4);
settextstyle(1,0,2);
outtextxy(100,350,"SEARCH");
settextstyle(1,0,2);
outtextxy(380,350,"I'M FEELING LUCKY");
setcolor(8);
rectangle(140,200,480,230);
rectangle(93,350,183,380);
rectangle(370,350,580,380);
getch();
}

