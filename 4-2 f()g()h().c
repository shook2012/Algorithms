//编写一个程序，包含3个函数f()、g()和h()，3个函数均无参数，返回值均为int型。

//任务1：定义int a,b，要求在依次执行a=f()和b=f()后，a和b的值不同。
//任务2：定义int a,b，要求在依次执行a=(f()+g())+h()和b=f()+(g()+h())后，a和b的值不同。

#include <stdio.h>
int c=1;

int f()
{   c++;   return c;   }

int g()
{   c++;   return c;  }

int h()
{   c++;   return c;  }

void main()
{ 
    int a,b;
    a=f();
    b=f();
    printf("a=%,b=%d",a,b);
}