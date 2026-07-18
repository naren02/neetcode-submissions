class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        
        this.tail = this.head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = this.head.next;
        while(curr != null && i < index ){
            curr = curr.next;
            i++;
        }
        if(i == index && curr != null){
            return curr.val;
        }else{
            return -1;
        }
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null) {  // If list was empty before insertion
            tail = newNode;
        }
        System.out.println("After adding "+val);
        System.out.println("Current List "+ getValues());
    }

    public void insertTail(int val) {
        if(this.tail == null){
            this.head = new ListNode(val, null);
            this.tail = this.head;
        }else{
            this.tail.next = new ListNode(val, null);
            this.tail = this.tail.next;
        }
         System.out.println("After adding "+val);
         System.out.println("Current List "+ getValues());
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
        //0 1 2 
        ListNode curr = this.head;
        while(curr != null && i < index ){
            curr = curr.next;
            i++;
        }
        System.out.println("Curr >> "+ curr);
        if(curr!= null && curr.next != null){
            if(curr.next == this.tail){
                
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
            ListNode curr = this.head.next;
            ArrayList<Integer> values = new ArrayList();
            while(curr!= null){
                values.add(curr.val);
                curr = curr.next;
            }
            return values;
    }
}

public class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this(val, null);
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public String toString(){
        return "Node["+this.val+"]";
    }
}
