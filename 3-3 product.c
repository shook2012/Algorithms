// 3-3 乘积的末三位
// 输入若干个整数，输出它们的乘积的末3位。这些整数中会混入一些由大写字母组成的字符串，你的程序应当忽略它们

#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  

#define MAXN 1000
#define MOD 1000
char a[MAXN];

int main()
{
	int num = 0, result = 1;
	int OK=1;
	float sum = 0;
	while (scanf("%s", a) == 1)
	{
		int n = strlen(a);
		for (int i = 0; i < n; i++)
		{
			if (a[i] >= '0' &&a[i] <= '9')           //未考虑负数
			{
				num = num * 10 + a[i] - '0';
				num = num%MOD;
				OK = 1;
			}
			else
			{
				OK = 0;
				break;
			}
		}
		if (OK==1)
		result = result*num%MOD;
		num = 0; 			 //读取完一个数后都要清零
	}
	printf("%d", result);
	//printf("%.3lf\n", sum / count);
	system("PAUSE");
	return 0;
}



//以下是考虑了负数的代码，注意break和continue的用法
#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  
#define MAXN 100  
#define MOD 1000  
char a[MAXN];

int main(int argc, char *argv[])
{
	int i, n;
	long sum = 0, product = 1;
	int sign=1;
	while (scanf("%s", a) == 1)
	{
		n = strlen(a);
		for (i = 0; i < n; i++)
		{
			if (a[i] >= 'A' && a[i] <= 'Z') break; 		//跳出关于本次a的循环
			if (a[i] == '-')  { sign = -1; continue; }   //忽略本次循环
			sum = (sum * 10 + a[i] - '0') % MOD;
		}
		if (a[i] >= 'A' && a[i] <= 'Z') continue;    //如何这次a是大写字母 就跳过本次product的运算
		product = sign*product*sum%MOD;
		sum = 0;
		sign = 1;
	}
	printf("%3d\n", product);
	system("PAUSE");
	return 0;
}