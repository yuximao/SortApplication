package com.example.linkedlist;

public class PrintLinkedlist {
    static void print(LinkedlistNode head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }

}
