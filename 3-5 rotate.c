// 3-5旋转
// 输入一个n*n字符矩阵，把它左转90度后输出


//我的理解是，字符矩阵就是一个个字符组成的矩阵，空格也属于字符，所以没有针对空格专门处理
#include <stdlib.h>  
#define MAXN 100  

int main(int argc, char *argv[])
{
	char a[MAXN][MAXN];
	for (int i = 0; i < MAXN; i++)        //初始化a
		for (int j = 0; j < MAXN; j++)
			a[i][j] = 0;
	char b[MAXN*MAXN];                     
	memset(b, 0, sizeof(b));              //初始化b

	int n;
	scanf("%d\n", &n);
    
	for (int j = 0; j < n; j++)
	{ 
		int i = 0;
		scanf("%s", b);                 //b是一维数组
		while (i < n)
		{
			a[j][i] = b[i];
			i++;
		}

	}

	printf("\n");

	for (int i = n-1; i >= 0; i--)
	{
		for (int j = 0; j < n;j++)
		{
			printf("%c", a[j][i]);
		}
		printf("\n");
	}


	system("PAUSE");
	return 0;
}