//#include<bits/stdc++.h>
#include<stdio.h>
//#include<conio>
#include<graphics.h>
using namespace std;

int main()
{
	float a;
	clock_t time_req;
	
	time_req = clock();
	for(int i=0; i<200000; i++)
	{
		a=log(i*i*i*i);
	}
	
	time_req = clock()-time_req;
	cout<< "Processor time taken for multiplication : "<<(float)time_req/CLOCKS_PER_SEC <<" Seconds" <<endl;
	
	//Using pow function
	time_req = clock();
	for(int i = 0; i<200000; i++)
	{
		a = log(pow(i, 4));
	}
	time_req = clock() - time_req;
	cout<<"Processor time taken in pow function : " <<(float)time_float/CLOCKS_PER_SEC <<" Seconds" <<endl;
return 0;	
}
