package sinergy.modul_3.task2.link;

public class NodeList<T> {
    Node first;

    NodeList() {
        first = null;
    }

    public void insertFirst(T data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    public void deleteFirst() {
        first = first.next;
    }

    public void addLastElement(T data) {
        if (first == null) {
            insertFirst(data);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(data);
            current.next=newNode;
        }
    }
    public void deleteAfter(Node after){
        Node current = first;
        while (current.data!=after.data){
            current=current.next;
        }
        current.next=current.next.next;
    }
    public void add(){

    }
    public int size(){
        return 0;
    }
    public int get(int index){
        return 0;
    }
    public int remove(int index){
        return 0;
    }
}
