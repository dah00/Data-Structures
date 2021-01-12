package BalancedExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> openBrackets = Arrays.asList('(','<','[','}');
    private final List<Character> closedBrackets = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()){
            if (isOpenBracket(ch))
                stack.push(ch);
            if (isClosedBracket(ch)){
                if (stack.empty())
                    return false;

                var top = stack.pop();
                if (!bracketsMatch(top,ch))
                    return false;
            }

        }
        return stack.isEmpty();
    }

    private boolean isOpenBracket(char ch){
        return openBrackets.contains(ch);
    }

    private boolean isClosedBracket(char ch){
        return closedBrackets.contains(ch);
    }

    private boolean bracketsMatch(char open, char close){
        return openBrackets.indexOf(open) == closedBrackets.indexOf(close);
    }
}
