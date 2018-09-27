package com;

//在一次递归后找到单链表的中间元素
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();

        linkedList.add( new LinkedList.Node("1"));
        linkedList.add( new LinkedList.Node("2"));
        linkedList.add( new LinkedList.Node("3"));
        linkedList.add( new LinkedList.Node("4"));
        linkedList.add( new LinkedList.Node("5"));
        linkedList.add( new LinkedList.Node("6"));
        linkedList.add( new LinkedList.Node("8"));

        LinkedList.Node current = head;
        int length = 0;
        LinkedList.Node middle = head;

        while(current.next() != null) {
            length++;
            if (length%2 == 0) {
                middle = middle.next();
            }
            current = current.next();
        }
        if (length%2 == 1) {
            middle = middle.next();
        }
        System.out.println("链表长度：" + length);
        System.out.println("链表中间数值：" + middle);
    }
}
class LinkedList{
    private Node head;

    private Node tail;

    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }

    public Node head(){
        return head;
    }

    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }

        public String data() {
            return data;
        }
        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String toString(){
            return this.data;
        }
    }

}
