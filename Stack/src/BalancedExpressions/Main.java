package BalancedExpressions;

public class Main {
    public static void main(String[] args) {
        String str = "(([1] + <2>))[a]";
        Expression balance = new Expression();
        System.out.println(balance.isBalanced(str));
    }
}
