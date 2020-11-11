package com.example.queue;

public class PriorityQueue {

    private int size;
    private Node front;
    private Node rear;

    public PriorityQueue() {
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


    public void enQueue(Node node) {
        this.size++;
        if(this.size>5) {
            System.out.println("StackOverFlow");
            this.size--;
        }

        if(this.size==1) {
            this.front=node;
            this.rear=node;
        }
        else {
            if(node.getVal()<this.front.getVal()){
                node.setNext(this.front);
                this.front=node;
            }else{
                this.rear.setNext(node);
                this.rear=node;
            }
        }
    }

    public Node deQueue() {
        if(this.size==0) {
            System.out.println("Empty Queue");
            return null;
        }
        this.size--;
        Node res = this.front;
        this.front=this.front.getNext();

        Node n=this.front;
        while(n!=null){
            if (front.getVal()>n.getVal()){
                int cur=this.front.getVal();
                this.front.setVal(n.getVal());
                n.setVal(cur);
            }
            n=n.getNext();
        }

        return res;
    }
}
