/* 1-9 三角形*/
/* 输入三角形三边长度值（均为正整数），判断它是否能为直角三角形的三个边长，
如果可以输出"yes"，如果不可以输出"no“，如果无法构成三角形，输出"not a triangle"*/

#include <stdio.h>
#include <math.h>

int main()
{

	//const double pi = 4.0*atan(1.0);

	
	/*double x1=0,y1=0,x2=0,y2=0;
	double distance=0;
	scanf_s("%lf%lf%lf%lf", &x1,&y1,&x2,&y2);
	distance = sqrt(pow(x2-x1,2)+pow(y2-y1,2));*/
	
	int a = 0, b = 0, c = 0;
	int temp = 0;
	//double m = 0;
	scanf_s("%d%d%d", &a,&b,&c);
    //排序
	if (b>a)
	{
		temp = a;		a = b;		b = temp;
	}
	if (c>a)
	{
		temp = a;		a = c;		c = temp;
	}
	if (c>b)
	{
		temp = b;		b = c;		c = temp;
	}

	if (c + b > a)  //？一个条件是否足够：较短两边之和小于最长边
	{
		if (a*a == (b*b + c*c))
			printf("yes");
		else
			printf("no");
	}
	else
		printf("not a triangle");
	//scanf_s("%lf", &m);
	

	system("pause");
	return 0;
}