package com.bridgelabz.stackusinglinkedlist;

public class MyStack<T> {
    MyLinkedList linkedList;
    public MyStack(){
        this.linkedList = new MyLinkedList();
    }

    public void push(T data) {
        linkedList.add(data);
        System.out.println(data + " is pushed in stack");
    }

    public void peak() {
        if(linkedList.calculateSize() > 0){
            System.out.print("Top of Stack is: ");
            linkedList.showTail();
        }else {
            System.out.println("Stack is empty.Cannot display Top of stack");
        }
    }

    public void pop() {
        if(linkedList.calculateSize() > 0){
            System.out.print("Popped element from stack is: ");
            System.out.println(linkedList.deleteLast());
        }else {
            System.out.println("Stack is empty.Cannot pop element");
        }
    }

    public void printStack() {
        if(linkedList.calculateSize() > 0) {
            System.out.print("Stack elements are: ");
            linkedList.display();
        }else{
            System.out.println("Stack is empty.Cannot display element");
        }
    }
}
