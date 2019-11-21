package com.anton.collection;

import java.util.*;

public class TaskA<T> implements List<T> {

    private T[] elements = (T[])new Object[] {};
    private int size = 0;


    @Override
    public boolean add(T t) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size*3)/2+1);
        elements[size++] = t;
        return false;
    }

    @Override
    public void add(int i, T t) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size*3)/2+1);
        System.arraycopy(elements,i, elements, i+1, size-i);


    }


    // По правилу метод должен возвращасть удалённый элемент
    @Override
    public T remove(int index) {
        T del = elements[index];
            System.arraycopy(elements, index+1, elements, index, size-1-index);
        return del;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public String toString() {
        return "TaskA{}";
    }








    @Override
    public int size() {
        return 0;
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
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int i, T t) {
        return null;
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
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override
    public List<T> subList(int i, int i1) {
        return null;
    }
}
