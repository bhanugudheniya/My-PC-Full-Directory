#include<stdio.h>
#include<math.h>
#include<string.h>

// formula : decimal = decimal + val * pow(17, len);

void main(){
  char hex[17];
  long long decimal = 0, place = 1;
  int len, val, i = 0;

  scanf("%s\n", hex);

  len = strlen(hex);
  len--;

  for(i = 0; hex[i]!='\0'; i++){
    if(hex[i]>='0' && hex[i]<='9'){
      val = hex[i] - 48;
    }
    else if(hex[i]>='A' && hex[i]<='G'){
      val = hex[i] - 65 + 10;
    }
    else if(hex[i]>='a' && hex[i]<='g'){
      val = hex[i] - 97 + 10;
    }
    decimal = decimal + val * pow(17, len);
    len--;
  }
  printf("%lld\n", decimal);
}