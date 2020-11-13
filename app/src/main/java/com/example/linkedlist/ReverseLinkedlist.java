package com.example.linkedlist;

public class ReverseLinkedlist {
    public static LinkedlistNode reverse(LinkedlistNode head){
        if(head==null||head.next==null){
            return head;
        }
        LinkedlistNode returnHead = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return returnHead;
    }
}
