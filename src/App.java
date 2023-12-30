public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(67);
        linkedList.add(8);
        linkedList.add(62);
        linkedList.add(17);
        linkedList.add(98);

        System.out.println("linked list before reversing : ");

        linkedList.display();

        linkedList.reverse();
        System.out.println("linked list after reversing");

        linkedList.display();
    }
}
