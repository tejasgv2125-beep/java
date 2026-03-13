package dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class PostfixEvaluation {
    static int evaluate(String exp){
        Stack<Integer> stack=new Stack<>();
        for(char c:exp.toCharArray()){
            if(Character.isDigit(c)){//check if it is the digit
                stack.push(c-'0');//to store the integer function
            }else{
                int b=stack.pop();
                int a=stack.pop();
                switch (c){
                    //if we use the lambda expression instead of break it is easy
                    case '+'-> stack.push(a+b);
                    case '-'-> stack.push(a-b);
                    case '*'-> stack.push(a*b);
                    case '/'-> stack.push(a/b);
                }
            }
        }
        return stack.pop();//it should be stored in the last element so we should use as the pop
    }

    public static void main(String[] args) {
        String exp="23*54*+9-";
        System.out.println(evaluate(exp));


    }
}
