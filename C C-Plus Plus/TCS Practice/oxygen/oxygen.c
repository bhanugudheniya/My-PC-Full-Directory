#include<stdio.h>
#include<math.h>

int main(){
    int i, x, T1 = 0, T2 = 0, T3 = 0, count = 1;
    double A1, A2, A3;

    while (count <= 9)
    {
        scanf("%d\n", &x);

        if(x >= 1 && x <=100){
            if(count % 3 == 1){
                T1 = T1 + x;
            }
            else if(count % 3 == 2){
                T2 = T2 + x;
            }
            else{
                T3 = T3 + x;
            }
            count++;
        }
        else{
            printf("Invalid Input\n");
            count++;
        }
    }

    A1 = round(T1/3);
    A2 = round(T2/3);
    A3 = round(T3/3);

    if (A1 <= 70 && A2 <= 70 && A3 <= 70){
        printf("All trainees are unfit");
    }
    else if (A1 >= A2 && A1 >= A3){
        printf("Trainee Number : 1\n");
    }
    else if(A2 >= A1 && A2 >= A3){
        printf("Trainee Number : 2\n");
    }
    else if (A3 >= A1 && A3 >= A2){
        printf("Trainee Number : 3\n");
    }   
}