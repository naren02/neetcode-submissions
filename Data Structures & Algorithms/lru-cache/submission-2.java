class LRUCache {

    Map<Integer, Node> lruCache = new HashMap();
    int capacity = 0;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(-1, -1);
        this.tail =  new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void addNode(Node node){
         node.next = head.next;
         head.next.prev = node;
         head.next = node;
         node.prev = head;   
    }

    public void remove(Node node){
      //  Node prev = node.next.prev;
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    
    public int get(int key) {

        
      if(lruCache.get(key) != null){
        System.out.print(" get key k "+ key );
         Node node = lruCache.get(key);
          remove(node);
          addNode(node);
          System.out.print(" get value for k "+ node.value);
          return node.value;
      } else{
        return -1;
      }

     
    }
    
    public void put(int key, int value) {
       // Node node = new Node(key, )
       if(lruCache.get(key) != null){
            Node node = lruCache.get(key);
            node.value = value;
            remove(node);
            addNode(node);
            lruCache.put(key, node);
       }else{
             Node node = new Node(key, value);
             addNode(node);
             lruCache.put(key, node);
           //  System.out.println(" lruCache.size() & capacity "+lruCache.size()+ " "+ capacity);
             if(lruCache.size() > capacity){
                 lruCache.remove(tail.prev.key);
                remove(tail.prev);
               
             }
       }
       Node curr = this.head;
         System.out.print(" { ");
            while(curr != null){
                System.out.print(curr.value +" -> ");
                curr  = curr.next;
            }
        System.out.print(" }");


        System.out.println("");
        

    }

    public class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key , int value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
}
