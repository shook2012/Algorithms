/*1-6 偶数*/
/*输入一个整数，判断它是否为偶数。如果是，则输出"yes",否则输出"no"。提示：可以用多种方法判断*/
#include <stdio.h>
#include <math.h>

int main()
{	
	int a = 0, b =0,n=0;
	scanf_s("%d", &n);
	a = n % 2;//取余
	b = n & 1;//按位与

	if (a == 0)
		printf("yes\n");
	else
		printf("no\n");

	if (b == 0)
		printf("yes\n");
	else
		printf("no\n");
	
	system("pause");
	return 0;
}