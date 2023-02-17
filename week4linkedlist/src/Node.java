public class Node<T> {
    T data;
    Node next;
}

class Main2 {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>();
        n1.data = 1;
        Node<Integer> n2 = new Node<>();
        n2.data = 2;
        n1.next = n2;
        Node<Integer> n3 = new Node<>();
        n3.data = 3;

        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);

        printList(n1);
    }

    public static void printList(Node n) {
        int pointer = (int)n.data;
        System.out.println(pointer);
       do {
           pointer = (int)n.next.data;
           System.out.println(pointer);
       }while(n.next.data != null);
    }
}

