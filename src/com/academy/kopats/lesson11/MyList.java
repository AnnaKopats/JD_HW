package com.academy.kopats.lesson11;

import java.util.*;

public class MyList<T> implements List<T> {
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
    public T remove(int index) {
        T element = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return element;
    }

    @Override
    public T get(int index) {
        if (index > (size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public int size() {
        return this.size;
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
    public T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        T value = elements[index];
        elements[index] = element;
        return value;
    }

    @Override
    public void add(int index, T element) {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size = size + 1;
    }


    @Override
    public void clear() {
        final T[] elem = elements;
        for (int to = size, i = size = 0; i < to; i++)
            elem[i] = null;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] elements;
        if (numNew > (elements = this.elements).length - size)
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1+ (size + numNew));
        System.arraycopy(a, 0, elements, size, numNew);
        size = size + numNew;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }



    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }




    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
