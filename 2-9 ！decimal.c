// 2-9 分数化小数 
// 输入正整数a,b,c，输出a/b的小数形式，精确到小数点后c位
// a,b≤10^6,c≤100
#include <stdio.h>
#include <math.h>

int main()
{
	int a = 1, b = 6, c = 40;
	scanf_s("%d%d%d", &a,&b,&c);

	int k, i;
	printf("%d.", a / b);//输出整数部分跟小数点 
	k = a;

	for (i = 0; i < c - 1; i++)  //小数部分的前c-1位
	{
		k = (k%b) * 10;         //先将k=a*10 用k/b得一个数 (*10相当于补零）
								//这个数的个位数就为a/b小数点后第一位
								//k = a * 100 用k/b得一个数 这个数的个数为就为a/b小数点后第二位…
		printf("%d", k / b);
	}

	k = (k%b) * 10;
	if ((k%b) * 10 / b >= 5)   //四舍五入
		printf("%d", k / b + 1);
	else
		printf("%d", k / b);

	system("pause");
	return 0;
}
