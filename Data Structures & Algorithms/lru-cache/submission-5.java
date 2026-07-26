class LRUCache {

    Map<Integer, Node> lruCache;
    int capacity = 0;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.lruCache = new HashMap(capacity);
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
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    
    public int get(int key) {

        
      if(lruCache.get(key) != null){
         Node node = lruCache.get(key);
          remove(node);
          addNode(node);
          return node.value;
      } else{
        return -1;
      }

     
    }
    
    public void put(int key, int value) {
       if(lruCache.get(key) != null){
            Node node = lruCache.get(key);
            remove(node);
      }
             Node node = new Node(key, value);
             addNode(node);
             lruCache.put(key, node);
             if(lruCache.size() > capacity){
                 lruCache.remove(tail.prev.key);
                remove(tail.prev);
               
             }
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

