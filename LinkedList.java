public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void add_first(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void add_last(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = null;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void add_mid(int idx, int data){
        Node  newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int remove_first(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size == 0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if (size ==1) {
            int val = head.data;
            head = tail = null;
             size = 0;
             return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int remove_last(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size == 0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i  = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;   // or tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public int iterative_Search(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data ==key){
                return i;           // key found
            }
            temp = temp.next;
            i++;
        }
        return -1;        // key not found
    }


    public int helper_Recursive_Search(Node head , int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper_Recursive_Search(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper_Recursive_Search(head,key);
    }

    public void Reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;    // remove 1st
            return;
        }
        // size -n
        int i = 1;
        int itofind = size -n;
        Node prev  = head;
        while(i<itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // LL is Palindrome
    public Node findmidNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // find middle
        Node mid = findmidNode(head);

        // Reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;    // right half head
        Node left = head;

        // check left half and right half if equal
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}


    // Detect a loop / cycle in LL
    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Remove a loop / cycle in a LL
    public static void removeCycle(){
        boolean cycle = false;
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next=null;
    }

    // Merge sort on a LinkedList
    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;  // slow = mid
    }
    private Node merge(Node head1,Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getmid(head);
        // left & right ms
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        // merge
        return merge(newLeft,newRight);
    }


    // Zig Zag Linked List

    public void zigzag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node mid = slow;
        // reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        // zig zag merge
        while(left!= null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // updation
            left = nextL;
            right = nextR;
        }
    }


    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.print();
    ll.add_first(2);
    ll.print();
    ll.add_first(1);
    ll.print();
    ll.add_last(3);
    ll.print();
    ll.add_last(4);
    ll.print();
    }
}
