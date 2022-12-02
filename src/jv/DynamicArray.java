package jv;

public class DynamicArray {
    private Object[] data;
    private int size;

    public DynamicArray() {
        data = new Object[10];
        size = 0;
    }

    public void add(Object o) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = o;
        size++;
    }

    public Object get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicArray a = new DynamicArray();
        for (int i = 0; i < 100; i++) {
            a.add(i);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public class DArray implements Interator {
        private int index;

        public DArray() {
            index = 0;
        }

        public boolean hasNext() {
            return index < size;
        }

        public Object next() {
            return data[index++];
        }
    }
}
