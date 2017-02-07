// 3-6 进制转换一
// 输入基数（1<b<11),和正整数n（十进制），输出n的b进制表示

#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  
#define MAXN 100  

char c[MAXN];

int main(int argc, char *argv[])
{
	memset(c, 0, sizeof(c));

	int n = 0, b = 0;
	int i = 0;
	scanf("%d%d", &b,&n);

	while (n > 0)
	{
		c[i] = n%b;
		n = n / b;
		i++;
	}
	i--;  //最后一次计算完i++没有用，要抵消掉。
    
	for (; i >= 0; i--)
		printf("%d", c[i]);

	system("PAUSE");
	return 0;
}