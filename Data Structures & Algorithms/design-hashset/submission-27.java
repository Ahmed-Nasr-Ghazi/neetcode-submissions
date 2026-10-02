class MyHashSet {
    private final int BUCKETS = 769; // Prime number reduces collisions
    private LinkedList<Integer>[] table;

    public MyHashSet() {
        table = new LinkedList[BUCKETS];
    }

    private int hash(int key) {
        return key % BUCKETS;
    }

    public void add(int key) {
        int i = hash(key);
        if (table[i] == null) table[i] = new LinkedList<>();
        if (!table[i].contains(key)) table[i].add(key);
    }

    public void remove(int key) {
        int i = hash(key);
        if (table[i] != null) table[i].remove((Integer) key);
    }

    public boolean contains(int key) {
        int i = hash(key);
        return table[i] != null && table[i].contains(key);
    }
}