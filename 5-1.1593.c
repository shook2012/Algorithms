//1593 Alignment of Code https://uva.onlinejudge.org/external/15/1593.pdf
/**
Sample Input
␣␣start:␣␣integer;␣␣␣␣//␣begins␣here
stop:␣integer;␣//␣␣ends␣here
␣s:␣␣string;
c:␣␣␣char;␣//␣temp

Sample Output
start:␣integer;␣//␣begins␣here
stop:␣␣integer;␣//␣ends␣␣␣here
s:␣␣␣␣␣string;
c:␣␣␣␣␣char;␣␣␣␣//␣temp
**/

#include <iostream>  
#include<cstdio>  
#include<cstring>  
#include<algorithm>  
#include<sstream>  
#include<vector>  
using namespace std;  

vector<string> words[1010];  
int word_size[200];  
int main()  
{  
    string line;  

    int line_num=0;  
    memset(word_size,0,sizeof(word_size));  

    while(getline(cin,line))  // string line;  
    {  
        string temp;  
        int len,cnt=0;  
        stringstream ss(line);   ////向流中传值

        while(ss >> temp)    //向temp中写入值
        {  
            len=temp.size();  
            word_size[cnt]=max(word_size[cnt],len);  
            words[line_num].push_back(temp);  //在vector尾部加入一个数据。
            cnt++;  
        }  
        line_num++;  
    }  
    for(int i=0;i<line_num;i++)  
    {  
        for(int j=0;j<words[i].size();j++)  
        {  
            cout<<words[i][j];  
            int s=(int) words[i][j].size();  
            if(j!=(words[i].size()-1))  
            {  
                for(int k=s;k<word_size[j];k++)  
                cout<<" ";  
                cout<<" ";  
            }  
        }  
        cout<<endl;  
    }  
	

	system("pause");
	return 0;
}