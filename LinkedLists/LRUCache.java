class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    private void addNode(Node newNode){
        Node temp = head.next;

        newNode.next = temp;
        newNode.prev = head;

        head.next = newNode;
        temp.prev = newNode;
    }

    private void deleteNode(Node delNode){
        Node prevv = delNode.prev;
        Node nextt = delNode.next;

        prevv.next = nextt;
        nextt.prev = prevv;

    }
    public int get(int key) {
        if (m.containsKey(key)){
            Node resnode = m.get(key);
            int ans = resnode.val;

            m.remove(key);
            deleteNode(resnode);
            addNode(resnode);

            m.put(key, head.next);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
         if (m.containsKey(key)) {
            Node curr = m.get(key);
            m.remove(key);
            deleteNode(curr);
        }

        if (m.size() == cap) {
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));
        m.put(key, head.next);
    }

    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
