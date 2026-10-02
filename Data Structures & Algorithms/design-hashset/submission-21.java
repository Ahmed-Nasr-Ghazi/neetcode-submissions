class MyHashSet {

    private List<Integer>[] hashSet;

    public MyHashSet() {
        hashSet = new ArrayList[1000001];
    }
    
    public void add(int key) {
        if (hashSet[key] == null) {
            hashSet[key] = new ArrayList<Integer>(Arrays.asList(1));
        }
    }
    
    public void remove(int key) {
        hashSet[key] = null;
    }
    
    public boolean contains(int key) {
        return hashSet[key] != null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */