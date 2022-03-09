#include<iostream>
using namespace std;

class overloading
{
	public:
		int volume(int s)						//cube
		{
			return(s*s*s);
		}
		
		double volume(double r, int h)			//circle
		{
			return(3.14519*r*r*h);
		}
		
		long volume(long l, int b, int h)		//rectangle
		{
			return(l*b*h);
		}
};

int main()
{
	overloading o;
	cout<<"volume of cube" <<o.volume(10) <<endl;
	cout<<"volume of circle" <<o.volume(2.5) <<endl;
	cout<<"volume of rectangle" <<o.volume(100L, 75, 15) <<endl;
}
