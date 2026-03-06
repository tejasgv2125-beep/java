package dsa.collections.list;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //💠to push the element into the (add the element)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //💠top elementna display madoke
        System.out.println(stack.peek());

        //💠to know the size of the stack
        System.out.println(stack.size());

        //💠to remove the top  element in the stack
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

        //💠to empty the stack we use
        System.out.println(stack.empty());
        System.out.println(stack);

    }
}
