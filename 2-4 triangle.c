// 2-4 倒三角
// 输入正整数n≤20，输出一个n层的倒三角形
#include <stdio.h>
#include <math.h>

int main()
{
	int a = 0;
	int n = 0;
	scanf_s("%d", &n);
	
	for (; n > 0; n--)
	{
		for (int i = 0; i < a;i++)
		{
			printf(" ");
		}
		a++;
		for (int i = 0; i < (2 * n - 1);i++)
		{
			printf("#");
		}
		printf("\n");
	}

	system("pause");
	return 0;
}

