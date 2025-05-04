package UpgradeJava;

import java.util.Stack;

public class MyStack{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("vika");
        stack.push("oleh");
        stack.push("peyr");
        stack.push("tolik");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

//        while(!stack.isEmpty()){
//            stack.pop();
//            System.out.println(stack);
//        }

        stack.peek();
        System.out.println(stack);
    }
}
