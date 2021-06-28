package com.learn.algorithms;

class Node{
    int data;
    Node link;
    Node(){
        data = 0;
        link = null;
    }
    Node(int data, Node link){
        this.data = data;
        this.link = link;
    }

    /* Create getter and setter for the data members */
    public void setData(int data){
        this.data = data;
    }

    public void setLink(Node link){
        this.link = link;
    }

    public int getData(){
        return data;
    }

    public Node getLink(){
        return link;
    }
}

class LinkedList{
    Node start;
    Node end;
    int size;

    LinkedList(){
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int size(){
        return size;
    }

    public void insertAtBeginning(int value){
        Node node = new Node(value, null);
        size++;
        if(start == null){
            start = node;
            end = node;
        }else{
            node.setLink(start);
            start = node;
        }
    }

    public void insertAtEnd(int value){
        Node node = new Node(value, null);
        size++;
        if(end == null){
            start = node;
            end = node;
        }else{
            end.setLink(node);
            end = node;
        }
    }

    public void insertAtPos(int index, int value) {
        Node temp;
        temp = start;
        for(int i=1; i<size; i++) {
            if(i == index) {
                Node temp1 = temp.getLink();

            }
            temp = temp.getLink();
        }
        size++;
    }


//    public int deleteAtBeginning() {
//        Node temp;
//        temp = start;
//        if (start.getLink() == null) {
//            start = null;
//            end = null;
//        } else {
//            start.setLink(start);
//            temp.setLink(null);
//        }
//    }


    }



public class LinkedListClass {


}
