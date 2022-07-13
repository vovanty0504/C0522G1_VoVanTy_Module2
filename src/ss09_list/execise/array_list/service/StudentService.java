package ss09_list.execise.array_list.service;

import java.util.Arrays;

public class StudentService<E> implements IStudentService {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object element[];

    public StudentService() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public StudentService(int capacity) {
        if (capacity >= 0) {
            element = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new
                    IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public boolean add(E elements) {
        if (element.length == size) {
            this.ensureCapacity(5);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void add(Object elements, int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (element.length == size) {
            this.ensureCapacity(5);
        }
        if (element[index] == null) {
            element[index] = elements;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = element;
            size++;
        }
    }

    public E get(int index) {
        return (E) element[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    public StudentService<E> clone() {
        StudentService<E> eStudentService = new StudentService<>();
        eStudentService.element = Arrays.copyOf(this.element, this.size);
        eStudentService.size = this.size;
        return eStudentService;
    }

    public E remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("Error index" + index);
        }
        E elements = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;
    }

}
