// Singly linked list with basic operations: add, delete, reverse, print
public class SinglyLinkedList {
    static class Node {
        int val; Node next;
        Node(int v){val=v;}
    }
    Node head;
    public void add(int v){
        if (head==null) { head = new Node(v); return;}
        Node cur = head;
        while (cur.next!=null) cur = cur.next;
        cur.next = new Node(v);
    }
    public void deleteValue(int v){
        while (head!=null && head.val==v) head = head.next;
        Node cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.next.val==v) cur.next = cur.next.next;
            else cur = cur.next;
        }
    }
    public void reverse(){
        Node prev=null, cur=head;
        while (cur!=null){
            Node nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        head = prev;
    }
    public void printList(){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.val + (cur.next!=null?" -> ":"\n"));
            cur = cur.next;
        }
    }
    public static void main(String[] args){
        SinglyLinkedList l = new SinglyLinkedList();
        l.add(1); l.add(2); l.add(3); l.add(2);
        System.out.print("Original: ");
        l.printList();
        l.deleteValue(2);
        System.out.print("After delete 2: ");
        l.printList();
        l.reverse();
        System.out.print("Reversed: ");
        l.printList();
    }
}
