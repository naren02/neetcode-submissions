class LinkedList {
    
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        int i = 0;
        ListNode current = this.head;
        while(current != null && i < index){
            current = current.next;
            i++;
        }
        if(current == null){
            return -1;
        }
       return current.val;
    }

    public void insertHead(int val) {
        if(this.head == null){
             this.head =  new ListNode(val, null);
             this.tail = this.head;
        } else {
            this.head = new ListNode(val, head);
        }
    }

    public void insertTail(int val) {
        if(tail == null){
            this.head = new ListNode(val);
            this.tail = this.head;
        } else {
            this.tail.next = new ListNode(val);
            this.tail = this.tail.next;
        }
    }

    public boolean remove(int index) {
         if(this.head == null){
            return false;
         }
         if(index == 0){
            this.head = this.head.next;
            if (this.head == null) this.tail = null;
            return true;
         }
         
         int i = 0;
         ListNode curr = this.head;
         while(curr != null && i < index - 1){
            curr = curr.next;
            i++;
         }

        if(curr != null && curr.next != null ){
            if(curr.next == this.tail){
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList();
        ListNode node = this.head;
        while(node != null){
            values.add(node.val);
            node = node.next;
        }
        return values;
    }
}

class ListNode{
    Integer val;
    ListNode next;
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public ListNode(int val){
        this(val, null);
    }
    @Override
    public String toString(){
        return "Node ["+this.val+"]";
    }
}