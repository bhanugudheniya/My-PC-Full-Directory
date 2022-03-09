#include<stdio.h>

using namespace std;

int main()
{
	int x, y, a, b, temp;
	
	printf("Enter a and b");
	scanf("%d %d", a, b);
	
	a = &x;
	b = &y;
	
	temp = *b;
	*b = *a;
	*a = temp;
	
	printf("%d", "a : ",a);
	printf("%d", "b : ", b);
	
	return 0;
}
