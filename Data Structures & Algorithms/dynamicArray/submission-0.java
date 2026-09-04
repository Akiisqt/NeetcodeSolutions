class DynamicArray {

    private int capacity = 0;
    private int[] elements;
    private int size = 0;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return elements[i];
    }

    public void set(int i, int n) {
        elements[i] = n;
    }

    public void pushback(int n) {
        if (capacity == size) resize();

        elements[size] = n;
        size++;
    }

    public int popback() {
        size--;
        int n = elements[size];
        
        elements[size] = 0;

        return n;
    }

    private void resize() {
        this.capacity *= 2;
        
        int[] newElements = new int[capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
