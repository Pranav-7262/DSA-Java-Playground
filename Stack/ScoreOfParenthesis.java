package Stack;

import java.util.Stack;

public class ScoreOfParenthesis {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(scoreOfParentheses(s));
    }
    public static int scoreOfParentheses(String s) {
        Stack<Integer>stack = new Stack<>();
        int score = 0;
        for (char c:s.toCharArray()){
            if (c=='('){
                stack.push(score);
                score = 0;
            }
            else{
                score = stack.pop() + Math.max(score*2,1);
            }
        }
        return score;
    }
}
