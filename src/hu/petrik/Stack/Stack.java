package hu.petrik.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    protected List<T> elements;

    public Stack() {
        this.elements = new ArrayList<>();
        this.empty();
    }

    public void push(T element) {
        this.elements.add(element);
    }

    public T pop() {
        T element = null;
        if (this.elements.size() > 0) {
            element = this.elements.remove(this.elements.size()-1);
        } else {
            throw new StackEmptyException();
        }

        return element;
    }

    public T top() {
        return this.elements.get(this.elements.size()-1);
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public void empty() {
        this.elements.clear();
    }

}
