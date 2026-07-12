class LRUCache {

    int capacity;
    Node head ;
    Node tail;
    Map<Integer, Node> cache ;
    

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap(capacity);
        this.head = new Node(-1, -1);
        this.tail = new Node (-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        next.prev = prev;
        prev.next = next;
    }

    public void addHead(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node; 
        head.next = node;
    }

    public int get(int key) {
        if(cache.get(key) != null){
            Node node = cache.get(key);
            remove(node);
            addHead(node);
            return node.value;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
          if(cache.get(key) != null){
             remove(cache.get(key));  
          }
          Node node = new Node(key, value);
           cache.put(key, node);
           addHead(node);

           if(cache.size() > capacity){
            Node lru = this.tail.prev;
            remove(lru);
            cache.remove(lru.key);
           }
    }

}

class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int val){
        this.key = key;
        this.value = val;
        this.next = null;
        this.prev = null;
    }
}
