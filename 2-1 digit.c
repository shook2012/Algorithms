// 2-1 位数
/* 输入一个不超过10^9的正整数，输出它的位数。例如，12345的位数是5 */
//请不要使用任何数学函数，只用四则运算和循环语句实现。
#include <stdio.h>
#include <math.h>
#include <time.h>

int main()
{
	int x=1,n=0;
	int count = 0;
	scanf_s("%d", &n);

	for (;; x = x * 10)
	{
		if ((n / x) == 0)
		{
			printf("%d", count);
			break;
		}
		count++;	
	}
	
	system("pause");
	return 0;
}

