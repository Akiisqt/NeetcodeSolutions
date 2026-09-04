class DynamicArray {
    private int[] elements;
    private int capacity = 0;
    private int size = 0;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.size = 0;
    }

    public final int get(int i) {
        return elements[i];
    }

    public final void set(int i, int n) {
        elements[i] = n;
    }

    public final void pushback(int n) {
        if (capacity == size) {
            this.capacity <<= 1;
        
            int[] newElements = new int[capacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }

            elements = newElements;
        }

        elements[size] = n;
        size++;
    }

    public final int popback() {
        return elements[--size];
    }

    private final void resize() {
        this.capacity <<= 1;
        
        int[] newElements = new int[capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    public final int getSize() {
        return size;
    }

    public final int getCapacity() {
        return capacity;
    }
}
