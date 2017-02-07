// 3-8 手机键盘
// 输入一个由小写字母组成的英文单词，输出用手机的默认英文输入法的敲键序列。
// 例如要打出pig这个单词，需要按1次p，3次i，1次i，即为p1i3i1 


//char *strchr(const char* _Str, char _Val)
//功能：查找字符串_Str中首次出现字符_Val的位置
//说明：返回首次出现_Val的位置的指针，返回的地址是被查找字符串指针开始的第一个与Val相同字符的指针，如果Str中不存在Val则返回NULL。
//返回值：成功则返回要查找字符第一次出现的位置，失败返回NULL

#include<stdio.h>  
#include<string.h>  
#define MAXN 50  
  
int main()  
{  
    char word[MAXN],*p,*keyBd[8]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};  
    int i,j,len;  
    fgets(word,sizeof(word),stdin);  
    len=strlen(word);  
    for(i=0;i<len;i++)  
    {  
        for(j=0;j<8;j++)  
        {  
            if(p=strchr(keyBd[j],word[i]))  
            {  
                printf("%c%d",word[i],p-keyBd[j]+1);  //p会输出keyBd[j]中余下的所有内容（字符串）
            }  
        }  
    }  
    system("PAUSE");
	return 0;
}  