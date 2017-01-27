/* 1-1 平均数*/
/* 输入3个整数，输出它们的平均值，保留3位小数*/

#include <stdio.h>
#include <math.h>

int main()
{
	int a = 0, b =0,c=0;
	double m = 0;

	scanf_s("%d %d %d", &a, &b,&c);
	m = (a + b + c) / 3.0;

	printf("%.3lf\n",m );

	system("pause");
	return 0;
}