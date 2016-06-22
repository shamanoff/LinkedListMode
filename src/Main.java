public class Main {

    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.insertFirst(1);
        list.insertFirst(12);
        list.displayList();
        list.delFirst();

        System.out.println("_____________________");
        list.insertFirst(12);
        list.insertFirst(12);
        list.insertFirst(12);
        list.insertFirst(12);
        list.delFirst();
        list.insertFirst(33);

        list.displayList();
    }
}
