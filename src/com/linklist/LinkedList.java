package com.linklist;

/**
 * Created by plank-arfaa on 2/15/2016.
 */
public class LinkedList {
    public  LinkedList next;
    public  int data;
    public static LinkedList head=null;
    public LinkedList last;

    public LinkedList(){

    }
    public LinkedList createNode(int data)
    {
        LinkedList temp = new LinkedList();
        temp.data=data;
        temp.next=null;

        return temp;
    }
    public LinkedList insertNode(int data)
    {
        LinkedList temp = createNode(data);
        if(head==null)
        {
            head=temp;
        }
        else{
            last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=temp;

        }
        return temp;
    }
    public  void print(){
        LinkedList temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public int size() {
        int size = 0;
        LinkedList temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
    public void append(int data) {

        LinkedList temp = head;
        while (temp.next != null)        {
            temp=temp.next;
        }
        temp.next=insertNode(data);
    }

    public void removeNode(int data){
        LinkedList tmpNode = head;
        LinkedList prevNode = null;
        while (tmpNode != null) {
            if (tmpNode.data == data) {
                if (tmpNode == head) {
                    head = head.next;
                } else {
                    prevNode.next = tmpNode.next;
                }
            } else {
                 prevNode = tmpNode;
            }
            tmpNode = tmpNode.next;
        }
    }
    public int findByPos(int index) {
        LinkedList temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index)
                return temp.data;
                count++;
                temp = temp.next;
        }
        return 0;
    }

    public static void main(String args[]){

        LinkedList linkedList= new LinkedList();

        linkedList.insertNode(3);
        linkedList.insertNode(5);
        linkedList.insertNode(7);
        linkedList.insertNode(9);

        linkedList.append(10);
        linkedList.removeNode(7);
        linkedList.findByPos(2);

        linkedList.print();

        System.out.println("\n Size of the linkedlist "+linkedList.size());
        System.out.println("\n Element at second position is "+ linkedList.findByPos(2));

    }
}

