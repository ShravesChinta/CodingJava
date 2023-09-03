class LRUCache {
    Map<Integer, Node> map=new HashMap<>();
    Node head=new Node(0,0);
    Node tail=head;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            int result=node.value;

            map.remove(key);
            remove(node);
            insert(node);
            map.put(key, head.next);
            return result;
        }
        else
        return -1;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)) 
        {
        Node node = map.get(key);
        map.remove(key);
        remove(node);
        } 
        if (map.size() == capacity) 
        {
            map.remove(tail.prev.key);
            remove(tail.prev);
        } 
         
         insert(new Node(key, value));
         map.put(key, head.next);
    }

    private void remove(Node node)
    {
        Node prevv=node.prev;
        Node nextt=node.next;

        prevv.next=nextt;
        nextt.prev=prevv;

        
    }

    private void insert(Node node)
    {
        Node temp=head.next;

        node.next = temp;
        node.prev = head;

        head.next = node; 
        temp.prev = node;

    }
}

class Node {
        Node prev;
        Node next;
        int key;
        int value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

