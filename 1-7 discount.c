/*1-7 打折*/
/*一件衣服95元，若消费满300元，可打八五折。输入购买衣服件数，输出需要支付的金额（单位：元），保留两位小数*/
#include <stdio.h>
#include <math.h>

int main()
{
	int b =0,n=0;
	double sum = 0;
	scanf_s("%d", &n);
	
	sum = n * 95;
	if (sum >= 0)
	{
		if (sum >= 300)
			printf("%.2lf", sum * 0.85);
		else
			printf("%.2lf", sum);
    }
	system("pause");
	return 0;
}
