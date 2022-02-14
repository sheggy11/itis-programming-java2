package ru.kfu.itis.example1.impl;

import ru.kfu.itis.example1.base.MyList;

public class MyListImpl<T> implements MyList<T> {
    private final Object[] elements = new Object[1000];
    private int size = 0;

    @Override
    public void add(T element) {
        elements[size] = element;
        size++;
    }

    // TODO: Реализовать
    @Override
    public void remove(int index) {}

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
