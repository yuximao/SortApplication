package com.example.linkedlist;

public class SingleLinkedlist {
    public LinkedlistNode head;
    public LinkedlistNode tail;


    public void Insert(LinkedlistNode node){
        if(this.head==null){
            this.head=node;
        }else{
            this.tail.next=node;
        }
        this.tail=node;
    }
}
