package com.geekbrains;

public class OwnLinkedListMain {
    public static void main(String[] args) {
        OwnLinkedList<Integer> integerOwnLinkedList = new OwnLinkedList<>();
        OwnLinkedList<Integer> integerOwnLinkedListDel = new OwnLinkedList<>();
//        integerOwnLinkedList.addNode(150);
//        integerOwnLinkedList.addNode(347);
//        integerOwnLinkedList.addNode(111);
//        integerOwnLinkedList.addNode(789);
//        integerOwnLinkedList.addNode(222);
//        integerOwnLinkedList.addNode(345);

        integerOwnLinkedList.display();

        integerOwnLinkedList.addNode(2, 1);
        integerOwnLinkedList.addNode(1, 1);
        integerOwnLinkedList.addNode(3, 3);
        integerOwnLinkedList.addNode(4, 4);
        integerOwnLinkedList.display();

        integerOwnLinkedList.addNode(7777, 4);
        integerOwnLinkedList.display();

        integerOwnLinkedList.addNode(0, 1);
        integerOwnLinkedList.display();

        integerOwnLinkedList.addNode(6, 7);
        integerOwnLinkedList.display();
        integerOwnLinkedList.addNode(22, 3);
        integerOwnLinkedList.display();


        ///////////////////////////////////////////////////
        System.out.println("Удаление из пустого списка");
        //Удаление из пустого списка
        integerOwnLinkedListDel.deleteNode(1);

        System.out.println("Удаление из списка с одним элементом");

        integerOwnLinkedListDel.addNode(1);
        integerOwnLinkedListDel.display();
        integerOwnLinkedListDel.deleteNode(1);
        integerOwnLinkedListDel.display();


        System.out.println("Удаление из списка с двумя элементами");

        integerOwnLinkedListDel.addNode(1);
        integerOwnLinkedListDel.addNode(2);
        integerOwnLinkedListDel.display();
        integerOwnLinkedListDel.deleteNode(1);
        integerOwnLinkedListDel.display();


        integerOwnLinkedListDel.addNode(2);
        integerOwnLinkedListDel.addNode(3);

        System.out.println("Удаление из списка с тремя элементами с явно неверным индексом");
        integerOwnLinkedListDel.deleteNode(4);

        System.out.println("Удаление из списка с тремя элементами");
        integerOwnLinkedListDel.display();
        integerOwnLinkedListDel.deleteNode(2);
        integerOwnLinkedListDel.display();


        integerOwnLinkedListDel.deleteNode(1);
        integerOwnLinkedListDel.display();

        integerOwnLinkedListDel.deleteNode(1);
        integerOwnLinkedListDel.display();
    }
}
