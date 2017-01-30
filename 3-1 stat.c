// 3-1 分数统计
// 输入一些学生的分数，哪个分数出现的次数最多？

//任务一：分数均为不超过100的非负整数
#include <stdio.h>
#include <math.h>
#include <string.h>


#define MAXN 101 + 10  
int a[MAXN];

int main()
{
	int n, max = 0;

	memset(a, 0, sizeof(a));

	while (scanf("%d", &n) == 1)     //  按Ctrl+Z结束
	{
		a[n]++;
		if (a[n] > max) max = a[n];
	}

	
	for (int i = 0; i <= 100; i++)
	{
		if (a[i] == max) 
			printf("%d ", i);
	}


	printf("\n");
	memset(a, 0, sizeof(a));
	

	system("pause");
	return 0;
}

//任务二：分数均为不超过100的非负实数，但最多保留两位小数
#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  
#include <math.h>  

#define MAXN 10001 + 10  
int a[MAXN];

int main()
{
	double degree=0, m=0;
	int max = 0;
	memset(a, 0, sizeof(a));

	while (scanf("%lf",&degree) == 1)
	{
		double m = degree * 100;
		int n;
		n = (int)(m + 0.5);    //小数点第三位后四舍五入

		a[n]=a[n]+1;
		if (a[n] > max) max = a[n];
	}

	for (int i = 0; i <= 10000; i++)
	{
		if (a[i] == max) printf("%.2lf ", i*0.01);
	}
	printf("\n");

	system("PAUSE");
	return 0;
}