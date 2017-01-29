// 2-2 水仙花数
// 输出100~999中的所有水仙花数，若3位数ABC满足 ABC=A^3+B^3+C^3，则称为水仙花数。例如153
#include <stdio.h>
#include <math.h>

int main()
{
	int a = 0, b = 0, c = 0;
    
	for (int n = 100; n<1000; n++)
	{
		a = n / 100; b = (n / 10) % 10; c = n % 10;
		if (n == (a*a*a + b*b*b + c*c*c))
			printf("%d\n", n);
	}

	system("pause");
	return 0;
}

