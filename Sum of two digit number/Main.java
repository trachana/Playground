#include<stdio.h>
int main()
{
int n,f,l;
  scanf("%d %d %d",&n,&f,&l);
  f=n/10;
  l=n%10;
  
  printf("%d",f+l);
  return 0;
}