/*1-2 温度*/
/*输入华氏温度f，输出对应的摄氏温度c，保留3位小数。 c=5(f-32)/9*/
#include <stdio.h>
#include <math.h>

int main()
{
	double f=0, c=0;
	scanf_s("%lf", &f);
	c = 5.0*(f - 32.0) / 9.0;
	
	printf("%.3lf\n",c);

	system("pause");
	return 0;
}