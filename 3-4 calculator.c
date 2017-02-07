// 3-4 计算器
// 编写程序，读入一行恰好包含一个加号、减号或乘号的表达式，输出它的值。
// 这个运算符保证是二元运算符，且两个运算数均为不超过100的非负整数。
// 运算数和运算符可以紧挨着，也可以用一个或多个空格、TAB隔开。吭首末尾均可以有空格。
// 提示：选择合适的输入方法可以使问题简化。

// 只有加减法,我理解错题意了，以为是要输入一行多个数字的运算。题目意思应该只有两个运算数
#include <stdio.h>  
#include <stdlib.h>  
#include <string.h>  
#define MAXN 100  
#define MOD 1000  
char a[MAXN];
int b[MAXN];
int sign[MAXN];         // 符号单独列一个数组储存

int main(int argc, char *argv[])
{
	int i, n;
	long sum = 0, product = 0;
	int  count = 0;

	memset(b, 0, sizeof(b));    // memset()只能置0 或者 置-1
	sign[0] = 1;

	while (scanf("%s", a) == 1)
	{
		n = strlen(a);
		for (i = 0; i < n; i++)
		{
			if (a[i] == '+')
			{
				b[count] = sign[count]*sum;
				sum = 0;
				sign[count + 1] = 1;
				count++;
			}

			if (a[i] == '-')
			{
				b[count] = sign[count] * sum;
				sum = 0;
				sign[count + 1] = -1;
				count++;
			}

			/*if (a[i] == '\0')             //不能用\0作为判断结束的标志，因为输入TAB或空格时也会执行此片段
			{
				b[count] = sign[count] * sum;
			}*/

			if ((a[i] >= '0') && (a[i] <= '9'))
			{
				sum = sum * 10 + a[i] - '0';
			}
		}
	}

	for (int j = 0; j <= count; j++)           //计算product的部分要在while循环的外面，
    {                                       //因为输入TAB或空格时while循环会进入下一轮，那么会导致出错。
		product += b[j];
		printf("%d ", b[j]);
	}
	product += sign[count] * sum; // 加上最后一个数字             //每个加减号对应之前的一个数字，所以要加上最后一个数字。

	printf("%d\n", product);
	system("PAUSE");
	return 0;
}


//按题目意思，两个运算符的加减乘法
#include<stdio.h>   
#define MAXN 5000    
int main()
{
	int a, b, c;
	char f;
	scanf("%d", &a);
	scanf("%c", &f);
	while ((f != '+') && (f != '-') && (f != '*'))
		scanf("%c", &f);
	scanf("%d", &b);                        //会自动忽略整型之前的空格？
	if (f == '+') c = a + b;
	else  if (f == '-') c = a - b;
	else    c = a*b;
	printf("%d", c);  
	system("PAUSE");
	return 0;
}
