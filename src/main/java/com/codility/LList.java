package com.codility;

import java.util.LinkedList;

class LList<E> extends LinkedList<E> {
    // private Node<E> lastNode = null;
    transient int size=0;
    protected transient int modCount = 0;
    transient LList.Entry header = new Entry(null, null);
    transient LList.Entry last;

/*    public LList(){
//        this.header.previous=null;
//        this.header.next=this.header.previous;

  *//*      this.header.previous=null;
        this.header.next=null;*//*
    }*/

    @Override
    public boolean add(E el) {
//        this.last = new Node<E>(el, this.last);
//        this.size++;
//        return true;
        if(this.size==0){
            Entry newEntry = new Entry<E>(el, header, header);
            newEntry.previous.next = newEntry;
            newEntry.next.previous = newEntry;
            System.out.println(0);
            System.out.println(newEntry.element);
        } else {
            Entry newEntry = new Entry<E>(el, header, header.next);
            newEntry.previous.next = newEntry;
            newEntry.next.previous = newEntry;
            System.out.println(1);
            System.out.println(newEntry.element);
        }
        // this.last = newEntry;
        ++this.size;
        ++this.modCount;
        return true;
    }

    public int size() {
        return this.size;
    }

//    private class Node<E> {
//        private Node<E> currentNode;
//        private Node<E> previousNode;
//
//        private Node(E el) {
//            if(this.currentNode!=null) {
//                this.previousNode = currentNode.getPriviousNode();
//            } else this.previousNode = null;
//            this.currentNode = new Node(el);
//        }

//    private class Node<E> {
//        //        private Node<E> currentNode;
////        private Node<E> previousNode;
////
////        private Node(E el) {
////            if(this.currentNode!=null) {
////                this.previousNode = currentNode.getPriviousNode();
////            } else this.previousNode = null;
////            this.currentNode = (Node<E>) last;
////        }
//        // private Node<E> currentNode;
//        private Node<E> previousNode;
//        private E currentEl;
//
//        private Node(E el, LList.Node node) {
//            this.currentEl = el;
//            this.previousNode = node;
//        }
//
//        private Node<E> getPriviousNode() {
//            return this.previousNode;
//        }
//    }

    private class Entry<E> {
        E element;
        Entry<E> previous;
        Entry<E> next;

        public Entry(E element, Entry<E> previous, Entry<E> next){
            this.element=element;
            this.previous=previous;
            this.next=next;
        }

        public Entry(Entry<E> previous, Entry<E> next){
            this.previous=previous;
            this.next=next;
        }
    }
}
