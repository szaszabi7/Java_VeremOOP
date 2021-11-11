package hu.petrik.Stack;

public class StackFullException extends RuntimeException {

    public StackFullException() {
        System.err.println("A verem tele van, nem lehet további elemet hozzáadni!");
    }
}
