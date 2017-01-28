/*1-5 距离*/
/*输入4个浮点数 x1,y1,x2,y2,输出平面坐标系中点（x1,y1）到点（x2,y2）的距离*/
#include <stdio.h>
#include <math.h>

int main()
{
	double x1=0,y1=0,x2=0,y2=0;
	double distance=0;
	scanf_s("%lf%lf%lf%lf", &x1,&y1,&x2,&y2);
	distance = sqrt(pow(x2-x1,2)+pow(y2-y1,2));

	printf("%.3lf\n",distance);
	

	system("pause");
	return 0;
}