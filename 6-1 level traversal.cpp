// 6.3.2 层次遍历  输入一个二叉树
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAXN 256

typedef struct TNode{   //结点类型
  int have_value;   //是否被赋值过
  int v;            //节点值
  struct TNode* left, *right;
} Node;

Node* root;   //二叉树的根节点

Node* newnode() {
  Node* u = (Node*) malloc(sizeof(Node));   //申请动态内存
  if(u != NULL) {            //若申请成功
    u->have_value = 0;             //显式的初始化为0，malloc不会清零
    u->left = u->right = NULL;     //没有左右儿子
  }
  return u;
}

int failed;
void addnode(int v, char* s) {
  int n = strlen(s);
  Node* u = root;         //从根节点往下走
  for(int i = 0; i < n; i++)
    if(s[i] == 'L') {
      if(u->left == NULL) u->left = newnode();   //节点不存在，建立新节点
      u = u->left;									//往左走
    } else if(s[i] == 'R') {
      if(u->right == NULL) u->right = newnode();
      u = u->right;
    }                        //最后多余的有括号直接忽略
  if(u->have_value) failed = 1;  //如果已经赋值过说明输入有错误
  u->v = v;
  u->have_value = 1;    //做标记
}

void remove_tree(Node* u) {
  if(u == NULL) return;   //提前判断
  remove_tree(u->left);   //递归释放左子树的空间
  remove_tree(u->right);
  free(u);   //释放u节点本身的内存
}

char s[MAXN + 10];
int read_input() {     //读入节点
  failed = 0;
  remove_tree(root);
  root = newnode();  //创建根节点
  for(;;) {
    if(scanf_s("%s", s) != 1) return 0;  //整个输入结束
    if(!strcmp(s, "()")) break;   //读到结束标志就退出循环
    int v;
    sscanf_s(&s[1], "%d", &v);     //读入节点值
    addnode(v, strchr(s, ',')+1);   //查找逗号，插入结点
  }
  return 1;
}

int n = 0, ans[MAXN];       //节点总数，输出序列
int bfs() {    //宽度优先遍历
  int front = 0, rear = 1;
  Node* q[MAXN];
  q[0] = root;       //初始只有一个根节点
  while(front < rear) {
    Node* u = q[front++];
    if(!u->have_value) return 0;  //如果有节点没有被赋值过，说明输入有错误
    ans[n++] = u->v;             //增加到输出序列尾部
    if(u->left != NULL) q[rear++] = u->left;
    if(u->right != NULL) q[rear++] = u->right;
  }
  return 1;      //输入正确
}

int main() {
  while(read_input()) {
    if(!bfs()) failed = 1;
    if(failed) printf("-1\n");
    else {
      for(int i = 0; i < n; i++)
        printf("%d ", ans[i]);
      printf("\n");
    }
  }
	
	system("pause");
	return 0;
}
