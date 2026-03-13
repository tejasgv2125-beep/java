package dsa.dataStructures.linear.stacks;
import java.util.*;
public class ValidParentheses {
    static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){//{,(,[,],),}
            if(c=='('||c=='['||c=='{'){
                //push openening braces on to the stack
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(c==')'&&top!='(')return false;
                if(c=='}'&&top!='{')return false;
                if(c==']'&&top!='[')return false;
            }
        }
        return stack.empty();//The string is the valid parantheses
        //if there are some miss mathced characters
    }
    public static void main(String[] args) {
        String s1="{[()]}";
        String s2="{]{](]";
        String s3="([(";
        System.out.println(s1+"->"+(isValid(s1)?"Valid":"Invalid"));
        System.out.println(s2+"->"+(isValid(s2)?"Valid":"Invalid"));
        System.out.println(s3+"->"+(isValid(s3)?"Valid":"Invalid"));
    }
}
