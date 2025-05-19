package com.example.Esercizi.ingsw.esercizio16;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
private ArrayList<T> elementi;

    public Stack() {
        elementi = new ArrayList<>();
    }

    public void push(T elemento) {
        elementi.add(elemento);
    }

    public T pop() {
        if (elementi.isEmpty()) {
            throw new EmptyStackException();
        }
        return elementi.remove(elementi.size() - 1);
    }

    public T peek() {
        if (elementi.isEmpty()) {
            throw new EmptyStackException();
        }
        return elementi.get(elementi.size() - 1);
    }

    public boolean isEmpty() {
        return elementi.isEmpty();
    }
}
