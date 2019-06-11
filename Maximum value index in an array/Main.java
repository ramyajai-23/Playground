/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
  void largest_elem_index(int list[],int size);

int main()
{
int size,list[10],i;
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d",&list[i]);
  }
  largest_elem_index(list,size);
  return 0;
}
void largest_elem_index(int list[],int size)
{
  int i,large,max_idx;
  large=list[0];
  max_idx=0;
  for(i=1;i<size;i++)
  {
    if(large<list[i])
    {
      max_idx=i;
    }
  }
  printf("%d",max_idx);
}