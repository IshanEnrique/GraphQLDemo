package com.bharatkadam.dsa.tree;

public class Tree {
    class Node<T>{
        T data;
        Node<?> left;
        Node<?> right;

        private Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static <T> Node<?>  createNode(T data){
        return new Tree().new Node<>(data);
    }
}
