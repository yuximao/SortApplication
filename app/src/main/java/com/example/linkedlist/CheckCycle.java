package com.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class CheckCycle {
    static boolean hsdCycle(LinkedlistNode head){
        Set<LinkedlistNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)) return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
}
