public final class DynamicArray {
    private int[] elements;
    private int size;

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }

        elements = new int[capacity];
    }

    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public void set(int index, int value) {
        checkIndex(index);
        elements[index] = value;
    }

    public void pushback(int value) {
        if (size == elements.length) {
            resize();
        }

        elements[size++] = value;
    }

    public int popback() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }

        return elements[--size];
    }

    private void resize() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity == 0 ? 1 : oldCapacity << 1;

        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return elements.length;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }
}