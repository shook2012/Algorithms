/*1-3 连续和*/
/*输入正整数n，输出1+2+...+n的值。提示：目标是解决问题，不是联系编程*/

#include <stdio.h>
#include <math.h>

int main()
{

	int a = 0, n=0;
	double m = 0;
	scanf_s("%d", &n);

	if (n > 0)
	{
		a = (1 + n)*n / 2;
		printf("%d", a);
	}
	else
		printf("no answer");

	system("pause");
	return 0;
}