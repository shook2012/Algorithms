// 2-8 子序列的和
// 输入两个正整数 n<m<10^6,输出 1/n*n + 1/(n+1)(n+1)+...+1/m*m ，保留5位小数。
// 注意：本题有陷阱

#include <stdio.h>
#include <math.h>

int main()
{

	int symbol = 1;
	double h = 0;

	int m = 0, n = 0;
	scanf_s("%d%d", &n,&m);

	for (int i = n; i <= m; i++)
	{
		h = h + 1.0 / i/ i;  //在i>46340后，i*i将大于int型能表达的最大数值，产生溢出问题，
                            //使得i*i值在截断为int时结果为0而出现“被0除”错误。
                            //可以这样改善，把sum=sum+(double)1/(i*i);改成sum=sum+(double)1/i/i;就能规避这个问题。
	}
	
	printf("%.5lf", h);

	
	

	system("pause");
	return 0;
}