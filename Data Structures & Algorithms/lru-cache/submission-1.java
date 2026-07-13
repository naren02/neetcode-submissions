class LRUCache {
    int capacity;
    Map<Integer, Node> cache;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap(this.capacity);
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(this.cache.get(key) != null){
            Node node = cache.get(key);
            remove(node);
            addHead(node);
            return node.val;
        }else{
            return -1;
        }

    }
    
    public void put(int key, int value) {
        if(cache.get(key)!= null){
            Node node = cache.get(key);
            remove(node);
        }
        Node newNode = new Node(key, value);
        addHead(newNode);
        cache.put(key, newNode);
        if(cache.size() > capacity){
           Node nodetoDel = cache.get(tail.prev.key);
           remove(nodetoDel);
            cache.remove(nodetoDel.key);
        }
        
    }

    public void remove(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void addHead(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node; 
    }
}

class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
