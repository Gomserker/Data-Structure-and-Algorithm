package StackWithInterface;

public class ArrayStackWithInterface implements StackWithInterface{

    private int top;
    private int stackSize;
    private char[] stackArr;
    
  //stack을 생성하는 생성자
    public ArrayStackWithInterface() {
        top = -1; //스택 포인터 초기화
        stackArr = new char[this.stackSize];
    }
    
    public ArrayStackWithInterface(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }
    
    @Override
    public boolean isEmpty() {
        //stack 포인터가 -1이면 데이터가 없음. 따라서 false 출력
        return (top == -1);
    }
    @Override
    public boolean isFull() {
        //stack 포인터가 stack의 마지막 인덱스와 동일하면 false 아니면 false
        return (top == this.stackSize-1);
    }
    @Override
    public void push(char item) {
        if(isFull()) {
            System.out.println("stack is full");
        } else {
            //다음 스택 포인터가 가리키는 인덱스에 데이터(item) 추가
            stackArr[++top] = item;
            System.out.println("Inserted Item: " + item);
        }
    }
    @Override
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return 0;
        } else {
            System.out.println("Deleted Item: " + stackArr[top]);
            return stackArr[top--];
        }
        
    }
    @Override
    public char peek() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return 0;
        } else {
            System.out.println("Peeked Item: " + stackArr[top]);
            return stackArr[top];
        }
        
    }
    @Override
    public void clear() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
        } else {
            top = -1; //stack 포인터 초기화
            stackArr = new char[this.stackSize]; //새로운 stack array 생성
            System.out.println("Stack is Cleared");
        }
    }
    
    public void printStack() {
        if(isEmpty()) {
            System.out.println("텅텅 비어서 뽑을게 없음");
        } else {
            System.out.print("Stacked Elements: ");
//            for(char c:stackArr) {
//                System.out.print(c + " ");
//            }
                
                for(int i=0; i<=top; i++) {
                    System.out.print(stackArr[i] + " ");
//                    if(stackArr[top] == 0) {
//                        if(top == -1) {
//                            System.out.print(" ");
//                        }
//                    }
                }
            System.out.println();
        }
    }
}
