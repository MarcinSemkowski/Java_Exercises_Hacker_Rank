package HackerRank;


import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "{}()";
        String input1 = "({()})";
        String input2 = "{}(";
        String input3 = "[]";
        System.out.println( isSameString(input));
        System.out.println(isSameString(input1));
        System.out.println(isSameString(input2));
        System.out.println(isSameString(input3));



    }

    private static boolean isSameString(String string){
        Stack<Character> stack = new Stack<>();
        for (int i =0; i < string.length(); i++){

            switch (string.charAt(i)){
                case '{':
                    stack.push('{');
                    break;
                case '(':
                    stack.push('(');
                   break;
                case '[':
                    stack.push('[');
                    break;
                case '}':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '{'){
                        return false;
                    }
                   break;
                case ')':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '('){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '['){
                        return false;
                    }
                    break;


            }
        }
       return stack.isEmpty();
    }

}





