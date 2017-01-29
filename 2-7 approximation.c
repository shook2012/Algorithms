// 2-7 近似计算
// 计算 π/4=1-1/3+1/5-1/7...，知道最后一项小于10^-6

#include <stdio.h>
#include <math.h>

int main()
{

	int symbol = 1;
	double h = 0,x=1;
	
	for (int i = 1; x > 1e-6; i++)
	{
		x =  1.0/ (2*i-1);		
		h = h + symbol*x;
		symbol = -symbol;
	}
    
	printf("%lf", h);

	system("pause");
	return 0;
}