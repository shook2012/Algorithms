// 2-5 统计 
// 输入一个正整数n，然后读取n个正整数a1,a2,...，an，最后再读一个正整数m。
// 统计a1,a2,...，an中有多少个证书的值小于m
//提示：如果重定向和fopen都可以使用，哪个比较方便？

#include <stdio.h>
#include <math.h>

//#define LOCAL    //没有使用重定向
int main()
{
#ifdef LOCAL
	freopen("C:\\Users\\YuL_e\\Desktop\\input.txt", "r", stdin);
	freopen("C:\\Users\\YuL_e\\Desktop\\output.txt", "w", stdout);
#endif

	FILE *fin;
	fin = fopen("C:\\Users\\YuL_e\\Desktop\\data1.txt", "rb");
	

	int n = 0,m = 0;
	int x = 0,count = 0;;
	scanf_s("%d%d", &n,&m);


	for (int i = 0; i < n; i++)
	{
		fscanf(fin, "%d", &x);				
		if (x < m)
			count++;							
	}
	printf("%d", count);

	fclose(fin);
	
	system("pause");
	return 0;
}

