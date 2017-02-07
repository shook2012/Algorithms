// 3-7 进制转换二
// 输入基数（1<b<11),和正整数n（b进制），输出n的十进制表示

#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  
#include <math.h>
#define MAXN 100  

char n[MAXN];


int main(int argc, char *argv[])
{
	memset(n, 0, sizeof(n));
	int	b = 0;
	int j = 0;
	int result = 0;
	scanf("%d", &b);
	scanf("%s", &n);
	int length = strlen(n);

	for (int i = length - 1; i >= 0;i--)           //从最低位开始，也就是n的倒序
	{
		result = result + pow(b,j)*(n[i] - '0');
		j++;
	}

	printf("%d", result);

	system("PAUSE");
	return 0;
}