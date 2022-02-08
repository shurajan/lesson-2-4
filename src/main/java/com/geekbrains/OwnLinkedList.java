package com.geekbrains;

public class OwnLinkedList<T> {
    private long size;
    private Node head;
    private Node tail;

    public OwnLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    public void addNode(T data, long index) {

        if (index > size + 1 || index < 1) {
            System.out.println("Индекс должен быть в диапазоне от 1 до " + (size + 1));
            return;
        }


        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            Node prevoius = null;

            for (int i = 1; i < index; i++) {
                prevoius = current;
                current = current.next;
            }
            newNode.next = current;
            //Если добавили в конец, то нужно обновить tail
            if (newNode.next == null) tail = newNode;

            if (prevoius != null) {
                //вставляем после head
                prevoius.next = newNode;
            } else {
                //Вставляем перед head
                head = newNode;
            }
        }

        size++;
    }

    public void deleteNode(long index) {

        if (index > size || index < 1) {
            System.out.println("Нет элемента с таким индексом");
            return;
        }

        Node current = head;
        Node prevoius = null;

        for (int i = 1; i < index; i++) {
            prevoius = current;
            current = current.next;
        }

        if (current.next == null) tail = prevoius;

        if (prevoius == null) {
            head = current.next;
        } else {
            prevoius.next = current.next;
        }

        size--;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("Односвязный список пуст");
            return;
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void display(int index) {
        if (index > size) {
            System.out.println("Размер списка больше чем заданный индекс");
            return;
        }

        Node current = head;

        for (int i = 1; i <= index; i++) {
            current = current.next;
        }

        System.out.println(current.data);
    }


    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
