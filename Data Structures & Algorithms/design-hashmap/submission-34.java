class Node {
    int key;
    int value;
    Node next;

    Node(int key, int value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

class MyHashMap {
    private Node[] nodesList;

    public MyHashMap() {
        nodesList = new Node[1001];
    }

    private int hash(int key) {
        return key % nodesList.length; // Fixed: Use modulo %
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node n = nodesList[index];

        if (n == null) {
            nodesList[index] = new Node(key, value, null);
            return;
        }

        while (n != null) {
            if (n.key == key) {
                n.value = value; // Key exists -> update in place
                return;
            }
            if (n.next == null) {
                n.next = new Node(key, value, null); // Append at tail
                return;
            }
            n = n.next;
        }
    }

    public int get(int key) {
        Node n = nodesList[hash(key)];

        while (n != null) {
            if (n.key == key) {
                return n.value;
            }
            n = n.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node n = nodesList[index];

        if (n == null) return;

        // Head match
        if (n.key == key) {
            nodesList[index] = n.next;
            return;
        }

        // Sub-node match
        while (n != null) {
            if (n.next != null) {
                if (n.next.key == key) {
                    n.next = n.next.next;
                    return;
                }
            } else {
                return; // Reached tail, key not found
            }
            n = n.next;
        }
    }
}