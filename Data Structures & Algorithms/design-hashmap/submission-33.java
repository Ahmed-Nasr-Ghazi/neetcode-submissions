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
            System.out.println ("put in the head " + key + ", " + value);
            nodesList[key / 1000] = new Node(key, value, null);
        } else {
            while (n != null) {
                System.out.println ("n.next != null");
                if (n.key == key) {
                    System.out.println ("override " + key + ", " + value);
                    n.value = value;
                    return;
                }
                if (n.next == null) {
                    n.next = new Node(key, value, null);
                }
                n = n.next;
            }
            System.out.println ("put in the tail " + key + ", " + value);
            n = new Node(key, value, null);
        }
    }

    public int get(int key) {
        Node n = nodesList[key / 1000];
        while (n != null) {
            System.out.println ("get " + key);
            System.out.println ("cunrrent " + n.key + ", " + n.value);
            if (n.key == key) {
                return n.value;
            }
            n = n.next;
        }
        return -1;
    }

    public void remove(int key) {
        System.out.println ("Removing Key " + key);
        Node n = nodesList[key / 1000];
        if (n != null && n.key == key) {
            System.out.println ("Key in a head " + key);
            nodesList[key / 1000] = n.next;
            return;
        }
        while (n != null) {
            // System.out.println ("Key is not a head, on node " + n.key + ", " + n.next.value);
            if (n.next != null) {
                System.out.println ("Next is not null, on node " + n.next.key + ", " + n.next.value);
                if (n.next.key == key) {
                    System.out.println ("Found next, on node " + n.next.key + ", " + n.next.value);
                    n.next = n.next.next;
                    return;
                }
            } else {
                System.out.println ("Removing Key from tail " + key);
                n = null;
                return;
            }
            System.out.println ("Key is not found, moving forward " + key);
            n = n.next;
        }
    }
}
