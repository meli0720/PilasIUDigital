package org.example;

public class Pila {

    private String[] elementos;
    private int tope;

    public Pila(int tamano) {
        elementos = new String[tamano];
        tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public void push(String dato) {
        if (tope < elementos.length - 1) {
            tope++;
            elementos[tope] = dato;
        } else {
            System.out.println("La pila está llena");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String dato = elementos[tope];
            tope--;
            return dato;
        }
        return null;
    }

    public String peek() {
        if (!isEmpty()) {
            return elementos[tope];
        }
        return null;
    }

    public void clear() {
        tope = -1;
    }
}
