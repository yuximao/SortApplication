package com.example.linkedlist;

public class Compare {

    static boolean compareLists(LinkedlistNode head1, LinkedlistNode head2) {
        while(head1!=null&&head2!=null){
            if(head1.data!=head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        if(head1!=null||head2!=null){
            return false;
        }
        return true;
    }
}
