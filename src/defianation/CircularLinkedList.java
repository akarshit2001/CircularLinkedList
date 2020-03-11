package defianation;

public class CircularLinkedList {
    private Node front=null;
    private Node tail=null;
    private int size=0;

    private void addFirst(int item) {
        front=new Node(front,item);
tail=front;
        size++;
    }

    private void addAfter(Node node, int item) {
Node n1= node;
            n1.next = new Node(n1.next, item);
            n1.next.next=front;
            size++;


    }

    private void addAt(int index,int item) {
        if (index == 0) {
            addFirst(item);
        }
        else {
            addAfter(getNode(index-1),item);
        }
    }

    public void add(int item) {
        addAt(size,item);
    }

    public void display() {
Node temp= front;
       do{

           int dat= temp.getData();
           System.out.println(dat);
           temp=temp.next;
       }
       while (temp!=front);
    }

    private Node getNode(int index) {
        Node response=front;
        for (int i = 0; i < index; i++) {
            response=response.next;
        }
        return response;
    }



    private static class Node{
        private  Node next;
        private int data;

        public Node getNext() {
            return next;
        }

        public int getData() {
            return data;
        }

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
