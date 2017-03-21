/*
定义栈的数据结构，
请在该类型中实现一个能够得到栈最小元素的min函数。
*/

/*
思路1：
使用两个栈
思路2：
左程云书上的第一题。。。
*/

import java.util.Stack;

public class Solution {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Solution(){
        this.stackData=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }
    
    public void push(int node) {
        if(this.stackMin.isEmpty()){
            this.stackMin.push(node);
        }
        else if(node<this.stackMin.peek()){
            this.stackMin.push(node);
        }
        this.stackData.push(node);
    }
    
    public void pop() {
        if(this.stackData.isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        else{
            int value = this.stackData.pop();
            if(this.stackMin.peek()==value)
                this.stackMin.pop();
            //return value;
            }
    }
    
    public int top() {
        if(this.stackData.isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        return this.stackData.peek();
    }
    
    public int min() {
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        else
            return this.stackMin.peek();
    }
}