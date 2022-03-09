#include<stdio.h>

void oneWay(void);
void anotherWay(void);

int main(void)
{
	printf("\nOneWay :\n");
oneWay();
printf("\nAnotherWay :\n");
anotherWay();
}

/*Array intialized with aggregate*/

void oneWay(void)
{
	int vect[10] = {1,2,3,4,5,6,7,8,9,0};
	int i;
	
	for(i=0; i<10; i++)
	{
		printf("i = %2d vect[i] = %2d\n",i,vect[i]);
	}
}

/*Array initalized with loop*/

void anotherWay(void)
{
	int vect[10];
	int i;
	
	for(i=0; i<10; i++)
	vect[i] = i+1;
	
	for(i=0; i<10; i++)
	printf("i = %2d vect[i] = %2d\n",i,vect[i]);	
}



