public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.display(l1.getHead());
        l1.displayRev(l1.getHead());

        l1.display();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();

        l1.insert(60, 1);
        l1.display();
        l1.insert(70, 4);
        l1.display();
        l1.insert(80, 8);
        l1.display();
        l1.insert(90, 10);
        l1.display();

        System.out.println("--------------------");
        l1.display(l1.getHead());
        System.out.println("--------------------");
        l1.displayRev(l1.getHead());

    }
}
