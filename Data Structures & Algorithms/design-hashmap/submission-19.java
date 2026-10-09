class MyHashMap {
    private int[][] arr;

    public MyHashMap() {
        arr = new int[1001][1001];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], -1);
        }
    }

    public void put(int key, int value) {
        int row = key / 1000;
        int col = key % 1000;
        arr[row][col] = value;
    }

    public int get(int key) {
        int row = key / 1000;
        int col = key % 1000;
        return arr[row][col];
    }

    public void remove(int key) {
        int row = key / 1000;
        int col = key % 1000;
        arr[row][col] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */