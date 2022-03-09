#include<iostream>
#include <graphics.h>
//#include<dos>

namespace using std;

void main()
{
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\\tc\\bgi");
	
	initwindow(400, 300, "Circle");
//    circle(100, 50, 40);
	
	Circle(300,300,50);
}
