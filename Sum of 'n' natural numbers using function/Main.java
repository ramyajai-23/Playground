#include<stdio.h>
int sum_of_natural_numbers(int num);
int main() {
  int n;
  scanf("%d",&n);
  printf("%d",sum_of_natural_numbers(n));
  	return 0;
}
int sum_of_natural_numbers(int num)
{
  int sum=0;
for(int i = 1; i <=num; i++){
  sum=sum+i;
}
return sum;
}