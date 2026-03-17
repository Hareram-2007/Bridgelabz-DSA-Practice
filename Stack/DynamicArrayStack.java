class DynamicArrayStack {

    int stack[] = new int[5];
    int top = -1;

    // Increase stack size
    void resize() {
        int newStack[] = new int[stack.length * 2];

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        System.out.println("Stack Resized to: " + stack.length);
    }

    // Decrease stack size
    void shrinkStack() {
        int newStack[] = new int[stack.length / 2];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        System.out.println("Stack Shrinked to: " + stack.length);
    }

    // Push operation
    void push(int x) {

        if (top == stack.length - 1) {
            resize();
        }

        stack[++top] = x;
    }

    // Pop operation
    int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int x = stack[top--];

        if (top < stack.length / 2 && stack.length > 5) {
            shrinkStack();
        }

        return x;
    }

    // Display stack
    void display() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        DynamicArrayStack s = new DynamicArrayStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);  // triggers resize

        s.display();

        s.pop();
        s.pop();
        s.pop();   // may trigger shrinkStack

        s.display();
    }
}