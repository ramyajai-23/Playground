#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int val=1;
  for(int cur_row=1;cur_row<=n;cur_row++)
  {
    for(int space=1;space<=(n-cur_row);space++)
    {
      printf(" ");
    }
    for(int cur_col=1;cur_col<=cur_row;cur_col++)
    {
      printf("%d ",val);
      val++;
    }
    printf("\n");
  }
	return 0;
}