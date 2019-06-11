#include <stdio.h>
int main() {
    int n;
  scanf("%d",&n);
  int val=n;
  for(int cur_row=1;cur_row<=n;cur_row++)
  {
    for(int cur_col=val;cur_col>=1;cur_col--)
    {
      printf("%d",cur_col);
    }
    val--;
    printf("\n");
  }
	return 0;
}