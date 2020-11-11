package com.example.queue;

public class Queue {

    private int size;
    private Node front;
    private Node rear;

    public Queue() {
        this.size=0;
    }
    public int getSize() {
        return size;
    }
    public Node getFront() {
        return front;
    }
    public Node getRear() {
        return rear;
    }


    public void addNode(Node node) {
        this.size++;
        if(this.size>5) {
            System.out.println("StackOverFlow");
        }
        if(this.size==1) {
            this.front=node;
            this.rear=node;
        }
        else {
            this.rear.setNext(node);
            this.rear=node;
        }
    }

    public Node popNode() {
        if(this.size==0) {
            System.out.println("Empty Queue");
            return null;
        }
        this.size--;
        Node n = this.front;
        this.front=this.front.getNext();
        return n;
    }
}
