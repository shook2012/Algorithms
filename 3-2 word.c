// 3-2 单词的长度
// 输入若干个单词，输出它们的平均长度，单词只包含大写字母和小写字母，用一个或多个空格隔开

#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  

#define MAXN 100  
char a[MAXN];

int main(int argc, char *argv[])
{
	int count = 0;
	float sum = 0;
	while (scanf("%s", a) == 1)
	{
		count++;
		sum += strlen(a);
	}

	printf("%.3lf\n", sum / count);
	system("PAUSE");
	return 0;
}