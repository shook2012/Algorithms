/*1-4 正弦和余弦*/
/*输入正整数n（n<360），输出n度的正弦、余弦函数值*/
#include <stdio.h>
#include <math.h>

int main()
{
	const double pi = 4.0*atan(1.0);

	int n=0;
	scanf_s("%d", &n);
	double theta=0.0;
	theta = n*pi / 180.0;

	printf("%.3lf\n",sin(theta));

	system("pause");
	return 0;
}