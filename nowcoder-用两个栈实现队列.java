/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。
队列中的元素为int类型。
*/


/*
思路：
入队：将元素进栈A
出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
 如果不为空，栈B直接出栈。
*/


import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);  //将元素进栈A
    }
    
    public int pop() {
        if(stack2.isEmpty()){
            if(stack1.isEmpty())
                throw new RuntimeException("the stack is empty");  //注意不是return而是throw
            else
                while(!stack1.isEmpty())
                    stack2.push(stack1.pop()); //判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B
        }
        return stack2.pop();  //栈B出栈
    }
}