class MyHashSet {

    private List<Integer> hashList;

    public MyHashSet() {
        hashList = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if (!hashList.contains(key)) {
            hashList.add(key);
        }
    }
    
    public void remove(int key) {
        if (hashList.contains(key)) {
            hashList.remove((Integer)key);
        }
    }
    
    public boolean contains(int key) {
        return hashList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */