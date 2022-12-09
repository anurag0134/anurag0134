#include<iostream>
using namespace std;
int b=20; //global variable
static int d=40;         //static global variable
int main()
{
	int a=10;            //local variable
	static int c=30;     // static local varable
	cout<<a<<" "<<b<<" "<<c;
	return 0;
}
