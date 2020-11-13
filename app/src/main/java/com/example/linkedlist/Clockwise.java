package com.example.linkedlist;

public class Clockwise {

    static LinkedlistNode Solution(LinkedlistNode node, int n ){
        int size=0;
        LinkedlistNode oldHead=node;
        LinkedlistNode head=null;
        while(node!=null){
            size++;
            node=node.next;
        }
        int counter=0;
        while(node.next!=null){
            counter++;
            if(counter>size-n){
                node.pre.next=null;
                head=node;
                head.pre=null;
            }
            node=node.next;
        }
        node.next=oldHead;

        return head;
    }
}
