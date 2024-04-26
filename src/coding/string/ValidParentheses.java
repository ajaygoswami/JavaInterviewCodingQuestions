package coding.string;

import java.util.*;

public class ValidParentheses {

    private Map<Character,Character> mappings ;

    public ValidParentheses(){
        this.mappings = new HashMap<>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

    public  Boolean isValidParentheses(final String str){
        if (str.isBlank()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<str.length() ; i++) {
            char c = str.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
          ValidParentheses validParentheses = new ValidParentheses();
          System.out.println("check if parentheses are valid in given string :"+validParentheses.isValidParentheses("{()[]}"));
    }
}
