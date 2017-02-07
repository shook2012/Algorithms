// 2-10 排列
// 用1,2,3...,9组成3个三位数abc,def,ghi,每个数字恰好使用一次
//要求 abc:def:ghi=1:2:3

//代码是别人写的，还没有看
#include<stdio.h>  
  
//分解三位数，数组相应位置值加一   
int fun(int t[],int i)  
{  
 t[i/100]++;  
 t[(i % 100)/10]++;  
 t[i % 10]++;  
}  
  
//将数组置为0   
void clearArray(int t[],int l)  
{  
 int i;  
 for(i=0;i<l;i++)  
     t[i]=0;       
}  
  
int main()  
{  
    int a[10]={0},i,j,k,p;  
    for(i=123;i<334;i++)  
    {  
       j=i*2;  
       k=i*3;  
       fun(a,i);  
       fun(a,j);  
       fun(a,k);  
       for(p=1;p<10;p++)  
       {  
       //如果数组元素值不全为1，则将数组元素全部置0   
        if(a[p]!=1)  
        {  
         clearArray(a,10);  
         break;      
        }  
       }   
       if(p==10)  
       {  
        printf("%d %d %d\n",i,j,k);  
       }     
    }  
    system("pause");  
}  
