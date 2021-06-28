package com.learn.algorithms;



public class BinaryTree {

    static class Node{
        int value;
        Node left;
        Node right;
        Node root;
        Node(){
            root = null;
        }
        Node(int value){
            this.value = value;
            left =  null;
            right =  null;
        }
    }

    public void inOrderPrint(Node node) {
        if (node != null) {
            inOrderPrint(node.left);
            System.out.print(node.value + " ");
            inOrderPrint(node.right);
        }
    }

    public void preOrderPrint(Node node) {
        if (node != null) {
            System.out.print(node.value + "");
            preOrderPrint(node.left);
            preOrderPrint(node.right);
        }
    }

    public void postOrderPrint(Node node) {
        if (node != null) {
            postOrderPrint(node.left);
            System.out.println(node.value + " ");
            postOrderPrint(node.right);
        }
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        } else {
            if (node.left == null) {
                node.left = insert(node.left, value);
            } else {
                node.right = insert(node.right, value);
            }
        }
        return node;
    }

    public static void main(String[] args) {
        Node node = new Node();
        BinaryTree tree = new BinaryTree();
        tree.insert(node.root, 10);
        tree.insert(node.root, 20);
        tree.insert(node.root, 7);
        tree.inOrderPrint(node.root);
    }
}

