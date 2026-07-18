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
        System.out.println("Inserting head "+ val);
    if(this.head == null){
         this.head =  new ListNode(val, null);
         this.tail = this.head;
    }else{
        this.head = new ListNode(val, head);
    }
            ListNode current = this.head;
            while(current!= null){
                System.out.println("Current List"+current.val);
                current = current.next;
            }
    }


    public void insertTail(int val) {
          System.out.println("Tail Inserted"+this.tail+ "with value " );
          if(head == null){
            this.head = new ListNode(val);
            this.tail = this.head;
          }
        if(tail == null ){
            this.tail = new ListNode(val);
        }
        tail.next = new ListNode(val);
            ListNode current = this.head;
            while(current!= null ){
                System.out.println("Current List"+current.val);
                current = current.next;
            }
    }

    public boolean remove(int index) {
         int i = 1;
         if(this.head == null){
            return false;
         }
         if(index == 0){
            this.head = null;
            this.tail = null;
            return true;
         }
         
         //0 1 2
         //p c
         //  p  c 
         ListNode prev = this.head;
         ListNode curr = prev.next;
        while(curr!= null && i < index){
            prev = curr;
            curr = curr.next;
            
           //curr = curr.next;
           i++;
        }
        System.out.println("Removing current "+curr+ " index i "+i);
        if(curr!= null ){
            prev.next = curr.next;
        }else{
            System.out.println(" Prev"+prev);
            prev.next = null;
            this.tail = prev;
        }
        
        if(i== index){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList();
        if(this.head == null ){
            return values;
        }
        ListNode node = this.head;
        values.add(node.val);
        while(node.next != null){
            node = node.next;
            values.add(node.val);
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
