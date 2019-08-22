package com.company;

public class SingleLinkList <T>implements SLLInterface <T> {
    private Node head;
    private int size;

    public SingleLinkList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public SingleLinkList() {

    }

    @Override
    public int getPositionAt(String data ) {
        Node temp= head;
        for (int i = 0; i <getCurrentSize(); i++) {
            Nim nim =(Nim) temp.getData();
            if(data.equals(nim.getAngka())){
               return 1;
            }else {
                temp=temp.getNext ();
            }
        }
        return -1;
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isEmpety() {
        if(size==0){
            return true;
        }else {


            return false;
        }
    }

    @Override
    public void fist(T data) {
        Node newNode=new Node(data);
        if(isEmpety()){
         head=newNode;

        }else {
            newNode.setNext(head);
        head=newNode;
    }
        }

    @Override
    public void tampil() {
        System.out.println("status : ");
        Node current=head;
        while(current!=null) {
            System.out.println(current.data);
            current=current.next;

        }

    }

    @Override
    public void last(T data) {
        Node newNode=new Node(data);
        Node temp=head;
        if(isEmpety()){
            head=newNode;
        }else{
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(newNode);
        }

    }

    @Override
    public void middle(T data) {

    }

    @Override
    public void Skip(T data) {

    }


    @Override
    public void remove(T data) {

    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}