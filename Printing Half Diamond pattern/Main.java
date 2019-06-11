#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int cur_row=1;cur_row<=n;cur_row++)
  {
    for(int space=1;space<=n-cur_row;space++)
    {
      printf(" ");
    }
    for(int cur_col=1;cur_col<=2*cur_row-1;cur_col++)
    {
      printf("*");
    }
    printf("\n");
  }
	return 0;
  
}