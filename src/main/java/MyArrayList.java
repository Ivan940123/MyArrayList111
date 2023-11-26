public class MyArrayList {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }
    /**
     * Adds an element to the end of the ArrayList.
     *
     * @param element the element to add
     */
    public void add(Object element) {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }
    /**
     * Returns the element at the specified index in the ArrayList.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }
    /**
     * Returns the size of the ArrayList.
     *
     * @return the size of the ArrayList
     */
    public int size() {
        return size;
    }
    /**
     * Removes the element at the specified index in the ArrayList.
     *
     * @param index the index of the element to remove
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void clearCollection() {
        elements.clone();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Element 1");
        myArrayList.add("Element 2");
        System.out.println(myArrayList.get(0)); // Output: Element 1
        System.out.println(myArrayList.size()); // Output: 2
        myArrayList.remove(0);
        System.out.println(myArrayList.size()); // Output: 1
    }
}
