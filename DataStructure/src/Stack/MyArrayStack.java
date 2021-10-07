/*
 *맨 마지막 위치(top)에서만 자료를 추가, 삭제, 꺼내올 수 있음(중간 자료 못 꺼냄)
 *LIFO구조(Last In First Out)
 *가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 무를때 사용가능(장기or바둑) 
 */

package Stack;

import Array.MyArray;

public class MyArrayStack {

    int top; //배열 맨 끝자리의 인덱스;
    MyArray arrayStack;
    
    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }
    
    public MyArrayStack(int size) {
        arrayStack = new MyArray(size);
    }
    
    public void push(int data) { //자료를 하나씩 쌓는 메소드
        if(isFull()) {
            System.out.println("Stack is already full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }
    
    public int pop() { //자료를 하나씩 빼는 메소드 맨 위에서부터 하나씩 빠진다.
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }
        else {
            return arrayStack.removeElement(--top);
        }
    }
    
    public int peek() { //마지막에 위치한 데이터 추출, 데이터 삭제하지 않음
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }
        else {
            return arrayStack.getElement(--top);
        }
    }
    
    public int getSize() {
        return top;
    }
    
    public boolean isFull() {
        if(top == arrayStack.ARRAY_SIZE) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return true;
        } else {
            return false;
        }
    }
    
    public void printAll() {
        arrayStack.printAll();
    }
}
