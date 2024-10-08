public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public int removefirst(){
        if(head == null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    // Reverse a DLL
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

    }
}
