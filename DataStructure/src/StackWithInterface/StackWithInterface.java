package StackWithInterface;

public interface StackWithInterface {
    boolean isEmpty();
    boolean isFull();
    void push(char item);
    char pop();
    char peek();
    void clear(); //스택 초기화: 데이터 전부 삭제
}
