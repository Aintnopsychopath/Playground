#include<iostream>
int main ()
{
  int w,x,y,profit,totalcost,z,a;
  std::cin>>w>>x>>y;
  totalcost=w*x;
  z=w*y;
  a=z+100;
  profit=totalcost-a;
  std::cout<<profit;
}
  