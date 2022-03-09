#include<stdio.h>
#include<conio.h>

int main()
{
	char choice;
	
	printf("******************************************");
	printf("\n\nThose Person Data Are Present In This Program\n\n");
	printf("******************************************\n\n");
	printf("1. Aakarsh\n2. Aditya\n3. Bhanu\n4. Inder\n5. Kamal\n6. Kartik\n7. Laxman\n8. Rahul\n9. Rajasva\n10. Shobit\n11. Vikas\n");
    printf("******************************************\n\n");
	printf("Enter Name Of Those Friend whose Details You Want\n");
	scanf("%c",&choice);
	
	if(choice=="Aakarsh" ||choice=="aakarsh" ||choice=="AAKARSH")
	{
		printf("Name - Aakarsh Chauhan\nCourse - BCA\nCollage - FIMT\nPhone Number - 8586875962\n");

	}
	else
	if(choice=="Bhanu" || choice == "bhanu" || choice == "BHANU")
	{
		printf("Name - Bhanu Gudheniya\nCourse - BCA\nCollage - FIMT\nPhone Number - 9818469385\n");
		
	}
	else
	if(choice=="Aditya" || choice == "aditya" || choice == "ADITYA")
	{
		printf("Name - Aditya Suryavanshi\nCourse - BCA\nCollage - FIMT\nPhone Number 1 - 8882208848\nPhone Number 2 - 9013697514\n");
		
	}
	else
	if(choice=="Kamal" || choice == "kamal" || choice == "KAMAL")
	{
		printf("Name - Kamal Kathuriya\nCourse - BCA\nCollage - FIMT\nPhone Number - 7289950465\n");
		
	}
	else
	if(choice=="Kartik" || choice == "kartik" || choice == "KARTIK")
	{
		printf("Name - Kartik\nCourse - BCA\nCollage - FIMT\nPhone Number - 9643799667\n");
		
	}
	else
	if(choice=="Laxman" || choice == "laxman" || choice == "LAXMAN")
	{
		printf("Name - Laxman Singh Bisht\nCourse - BCA\nCollage - FIMT\nPhone Number - 9953178874\n");
		
	}
	else
	if(choice=="Inder" || choice == "inder" || choice == "INDER")
	{
		printf("Name - Inder Singh Bisht\nCourse - BCA\nCollage - FIMT\nPhone Number - 9953178874\n");
		
	}
	else
	if(choice=="Shobit" || choice == "shobit" || choice == "SHOBIT")
	{
		printf("Name - Shobit Khatri\nCourse - BCA\nCollage - FIMT\nPhone Number - 7042082914\n");
		
	}
	else
	if(choice=="Rahul" || choice == "rahul" || choice == "RAHUL")
	{
		printf("Name - Rahul Choudhary\nCourse - BCA\nCollage - FIMT\nPhone Number - 9871793319\n");
		
	}
	else
	if(choice=="Rajasva" || choice == "rajasva" || choice == "RAJASVA")
	{
		printf("Name - Rajasva Raj Shrivastava\nCourse - BCA\nCollage - FIMT\nPhone Number - 8076522975\n");
		
	}
	else
	if(choice=="Vikas" || choice == "vikas" || choice == "VIKAS")
	{
		printf("Name - Vikas\nCourse - BCA\nCollage - FIMT\nPhone Number - 8882456301\n");
		
	}
		getch();
		return 0;

}
