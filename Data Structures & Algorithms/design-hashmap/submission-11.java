class MyHashMap {
    private List<List<Integer>> hash;

    public MyHashMap() {
        hash = new ArrayList<>();
    }

    public void put(int key, int value) {
        while (hash.size() <= key) {
            hash.add(null);
        }
        hash.set(key, new ArrayList<>(Collections.singletonList(value)));
    }

    public int get(int key) {
        if (key >= hash.size() || hash.get(key) == null) {
            return -1;
        }
        return hash.get(key).get(0);
    }

    public void remove(int key) {
        if (key < hash.size()) { // Fixed: '<' instead of '<='
            hash.set(key, null); // Fixed: nullifies slot cleanly
        }
    }
}