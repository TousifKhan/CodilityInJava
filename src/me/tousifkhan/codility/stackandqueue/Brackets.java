package me.tousifkhan.codility.stackandqueue;

import java.util.Stack;

//https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
public class Brackets {

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character c: S.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') stack.push(c);
            else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) return 0;
            else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) return 0;
            else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) return 0;
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.solution("{[()()]}") == 1);
        System.out.println(brackets.solution("([)()]") == 0);
    }
}
