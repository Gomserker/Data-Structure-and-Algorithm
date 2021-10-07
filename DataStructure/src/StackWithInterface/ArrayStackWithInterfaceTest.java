package StackWithInterface;

public class ArrayStackWithInterfaceTest {
    public static void main(String[] args) {
        
        int stackSize = 5;
        ArrayStackWithInterface arrStack = new ArrayStackWithInterface(stackSize);
        
        arrStack.push('A');
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.push('B');
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.push('C');
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.pop();
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.pop();
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.pop();
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.peek();
        arrStack.printStack();
        System.out.println("--------------");
        arrStack.clear();
        arrStack.printStack();
   
    }
}
