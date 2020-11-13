package com.example.sortapplication;

public class MainTest {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(5);
        tree.add(4);
        tree.add(7);
        tree.add(2);
        tree.add(6);
//        System.out.println(tree.find(6));
        tree.order();
    }
}
