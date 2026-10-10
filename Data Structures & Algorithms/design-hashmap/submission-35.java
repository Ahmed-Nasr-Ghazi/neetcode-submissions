class Node {
    int key;
    int value;
    Node next;

    Node(int key, int value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    // @Override
    // String toString() {
    //     return "Key: " + key + " Value: " + value + " Next: " + next;
    // }
}

class MyHashMap {
    private Node[] nodesList;

    public MyHashMap() {
        nodesList = new Node[1001];
    }

    public void put(int key, int value) {
        Node n = nodesList[key / 1000];
        if (n == null) {
            nodesList[key / 1000] = new Node(key, value, null);
        } else {
            while (n != null) {
                if (n.key == key) {
                    n.value = value;
                    return;
                }
                if (n.next == null) {
                    n.next = new Node(key, value, null);
                    return;
                }
                n = n.next;
            }
        }
    }

    public int get(int key) {
        Node n = nodesList[key / 1000];
        while (n != null) {
            if (n.key == key) {
                return n.value;
            }
            n = n.next;
        }
        return -1;
    }

    public void remove(int key) {
        Node n = nodesList[key / 1000];
        if (n != null && n.key == key) {
            nodesList[key / 1000] = n.next;
            return;
        }
        while (n != null) {
            // System.out.println ("Key is not a head, on node " + n.key + ", " + n.next.value);
            if (n.next != null) {
                if (n.next.key == key) {
                    n.next = n.next.next;
                    return;
                }
            } else {
                n = null;
                return;
            }
            n = n.next;
        }
    }
}
