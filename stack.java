import java.util.*;
public class stack {

    // push at bottom of the stack
    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }

    // Reverse string using stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.empty()){
            char curr = s.pop();
            res.append(curr);
        }
        return res.toString();
    }
    // Reverse stack
    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s,top);
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtbottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        String str = "abc";
        String res = reverseString(str);
        System.out.println(res);
    }
}
