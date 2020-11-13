package com.example.sortapplication;

class BinaryNode{
    int value;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTree2 {

    BinaryNode root;

    public void add(BinaryNode node) {
        root = add(node, root);
    }

    public void insert(int num) {
        root = insert(root, num);
    }

    public BinaryNode insert(BinaryNode root, int num) {
        if (root == null) {
            root = new BinaryNode(num);
            return root;
        }

        if (num < root.value) {
            root.left = insert(root.left, num);
        } else if (num > root.value) {
            root.right = insert(root.right, num);
        }
        return root;
    }

    public BinaryNode add(BinaryNode node, BinaryNode root) {
        if (root == null) return node;
        if (node.value < root.value) {
            root.left = add(node, root.left);
        } else {
            root.right = add(node, root.right);
        }
        return root;
    }

    public void inOrderTraverse(BinaryNode root) {
        if (root == null) return;
        inOrderTraverse(root.left);
        System.out.print(root.value + " ");
        inOrderTraverse(root.right);
    }


    public static void main(String[] args) {
        BinaryTree2 bt = new BinaryTree2();
        bt.insert(5);
        bt.insert(6);
        bt.insert(3);
        bt.insert(2);
        bt.insert(9);
        bt.insert(1);
        bt.insert(4);
        bt.inOrderTraverse(bt.root);
    }
}
