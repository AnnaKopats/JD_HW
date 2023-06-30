package com.academy.kopats.lesson11;

import java.util.*;


public class MySet<T> implements Set<T> {
    private T[] elements = (T[]) new Object[]{};
    private int size;

    @Override
    public boolean add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int i;
        if (size == 0) {
            return false;
        }
        for (i = 0; i < size; i++) {
            if (elements[i] == null && o == null) {
                break;
            }
            if (elements[i] != null && elements[i].equals(o)) {
                break;
            }
        }
        if (i < size) {
            shiftToLeft(i);
            return true;
        }
        return false;
    }

    private void shiftToLeft(int start) {
        size--;
        if (size <= 0) {
            return;
        }
        if (size != start) {
            System.arraycopy(elements, start + 1, elements, start, size - start);
        }
        elements[size] = null;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (((T) o).equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        int count = 0;
        for (T element : elements) {
            if (element == null) {
                count++;
                if (count == elements.length) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c.size() == 0) {
            return false;
        }
        T[] c1 = (T[])c.toArray();
        int capacity = elements.length;
        int newCapacity = size + c1.length;
        if (capacity < newCapacity) {
            elements = Arrays.copyOf(elements, size + c1.length);
        }
        for (int i = 0; i < c.size(); i++) {
            elements[i + size] = c1[i];
        }
        size += c1.length;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.size() == 0) {
            return false;
        }
        for (int i = 0; i < c.size(); i++) {
            if (!contains(elements[i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null) {
            return false;
        }
        if ((c.size() == 0) || size == 0) {
            return false;
        }
        boolean b = false;
        int i = 0;
        while (i < size) {
            if (c.contains(elements[i])) {
                shiftToLeft(i);
                b = true;
            } else {
                i++;
            }
        }
        return b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String separator = "";
        for (int i = 0; i < size; i++) {
            sb.append(separator).append(elements[i]);
            separator = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Spliterator<T> spliterator() {
        return Set.super.spliterator();
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] oArr = new Object[size];
        for (int i = 0; i < size; i++) {
            oArr[i] = elements[i];
        }
        return oArr;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    @Override
    public void clear() {

    }
}
