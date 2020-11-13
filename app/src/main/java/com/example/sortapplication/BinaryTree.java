package com.example.sortapplication;

public class BinaryTree {

    private int val;
    private BinaryTree leftTree;
    private BinaryTree rightTree;

    public BinaryTree(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public BinaryTree getLeftTree() {
        return leftTree;
    }

    public BinaryTree getRightTree() {
        return rightTree;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void add(int val){
        addElement(this, val);
    }

    public BinaryTree addElement(BinaryTree root,int val){
        if(root==null){
            root=new BinaryTree(val);
            return root;
        }
        if(val<root.val){
            return addElement(root.leftTree,val);
        }
        else{
            return addElement(root.rightTree,val);
        }

    }

    public Boolean find(int val){
        return findElement(this, val);
    }
    public Boolean findElement(BinaryTree root, int val){
        if(root.getVal()==val){
            return true;
        }
        if(val<root.leftTree.getVal()){
            return findElement(root.leftTree, val);
        }
        else{
            return findElement(root.rightTree, val);
        }
    }

    public void order(){
        inOreder(this);
    }
    public void inOreder(BinaryTree root){
        if(root!=null) {
            inOreder(root.getLeftTree());
            System.out.print("[" + root.getVal() + "]");
            inOreder(root.getRightTree());

        }
    }
}
