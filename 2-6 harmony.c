// 调和级数
// 输入正整数n，输出 H(n)=1+1/2+1/3+...+1/n 的值，保留三位小数
#include <stdio.h>
#include <math.h>

int main()
{

	int n = 0,m = 0;
	double h = 0;
	scanf_s("%d", &n);
	for (int i = 1; i <= n; i++)
	{
		h = h+1.0 / i;
	}

	printf("%.3lf", h);

	
	

	system("pause");
	return 0;
}