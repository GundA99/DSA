public class LinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(head == null) {
            head = newNode;
            return true;
        }

        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);

        return true;
    }

    public void display() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public boolean insert(int data, int position) {
        if(position <= 0) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //if the position is not 1

        //locate the prev node
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            //if the position is invalid, prev will become null
            if(prev == null) {
                return false;
            }
        }

        //link the newnode to the prev node
        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;

    }

    public void display(Node firstNode) {

        if(firstNode == null) {
            System.out.println();
            return;
        }

        System.out.print(firstNode.getData() + " ");
        display(firstNode.getNext());
    }

    public void displayRev(Node firstNode) {

        if(firstNode == null) {
            System.out.println();
            return;
        }

        displayRev(firstNode.getNext());
        System.out.print(firstNode.getData() + " ");
    }
}








