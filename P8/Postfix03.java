package P8;

public class Postfix03 {
    int n;
    int Top;
    char[] stack;

    public Postfix03(int total) {
        n = total;
        Top = -1;
        stack = new char[n];
        push('(');
    }

    public char[] getStack() {
        return stack;
    }

    public void setStack(char[] stack) {
        this.stack = stack;
    }

    public void push(char c) {
        Top++;
        stack[Top] = c;
    }

    public char pop() {
        char item = stack[Top];
        Top--;
        return item;
    }

    public boolean isOperand(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == ' ' || c == '.');
    }

    public boolean isOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return 0;
        }
    }
    public String konversi(String Q) {
        String P = "";
        char c ;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[Top] != '(') {
                    P = P + pop();
                }
                pop();
            
            } 
            if (isOperator(c)) {
                while (derajat(stack[Top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;  
    }    
}
