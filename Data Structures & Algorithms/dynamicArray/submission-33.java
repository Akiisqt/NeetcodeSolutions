public final class DynamicArray {
    private int[] elements;
    private int size;

    public DynamicArray(int capacity) {
        elements = new int[capacity];
    }

    public int get(int i) {
        return elements[i];
    }

    public void set(int i, int n) {
        elements[i] = n;
    }

    public void pushback(int n) {
        if (getSize() == getCapacity()) {
            resize();
        }

        elements[size++] = n;
    }

    public int popback() {
        return elements[--size];
    }

    private void resize() {
        int[] newElements = new int[getCapacity() << 1];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return elements.length;
    }
}