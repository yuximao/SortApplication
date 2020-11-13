package com.example.dfsbfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    int value;

    //array of list
    LinkedList<Integer>[] adj;

    void BFSImplement(int s){
        boolean[] visited = new boolean[value];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll(); //retrieves and removes head
            System.out.println(s + "");

            Iterator<Integer> it = adj[s].listIterator();
            while(it.hasNext()){
                int n = it.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
