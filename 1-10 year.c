/* 1-10 年份*/
/* 输入年份，判断是否为闰年，如果是输出"yes",否则输出"no"，提示：简单的判断除以4的余数的不够的*/

#include <stdio.h>
#include <math.h>

int main()
{
	int n;
	scanf_s("%d", &n);

	if (n % 100 == 0)
	{
		if ((n / 100) % 4 == 0)
			printf("yes");
		else
			printf("no");
	}
	else
	{
		if (n % 4 == 0)
			printf("yes");
		else
			printf("no");
	}

	system("pause");
	return 0;
}


