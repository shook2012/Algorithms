/*1-8 绝对值*/
/*输入一个浮点数，输出它的绝对值，保留两位小数*/
#include <stdio.h>
#include <math.h>

int main()
{
	double m = 0;
	scanf_s("%lf", &m);
	
	if (m >= 0)
		printf("%.2lf", m);
	else
		printf("%.2lf", -m);

	system("pause");
	return 0;
}