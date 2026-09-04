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
        if (capacity == size) resize();

        elements[size] = n;
        size++;
    }

    public final int popback() {
        return elements[--size];
    }

    private final void resize() {
        this.capacity <<= 1;
        
        int[] newElements = new int[capacity];
        System.arraycopy(elements, 0, newElements, 0, size);

        elements = newElements;
    }

    public final int getSize() {
        return size;
    }

    public final int getCapacity() {
        return capacity;
    }
}
