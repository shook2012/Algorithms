// 2-3 韩信点兵
// 韩信让士兵先后以三人一排 五人一排 七人一排变换队形，输入3个非负整数a,b,c，表示每种队形排尾的人数（a<3,b<5,c<7），输出总人数的最小值。
//或者报告无解，总人数范围是10-100
#include <stdio.h>
#include <math.h>

int main()
{
	int a=0,b=0,c=0;
    int wrong = 0;
	scanf_s("%d%d%d", &a,&b,&c);
    
	for (int n = 10; n<=100; n++)
	{
		if (((n % 3) == a) && ((n % 5) == b) && ((n % 7) == c))
		{
			printf("%d", n);
			wrong = 1;
		}
		
	}

	if (wrong == 0)
		printf("no answer");
	

	system("pause");
	return 0;
}

