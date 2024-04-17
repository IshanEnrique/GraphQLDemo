package com.bharatkadam.dsa.tree;

public interface BaseTree {
    public default void preOrderTraverse(Tree.Node<?> root){
        // System.out.println("\n\n>>>>>>>>>>>> PRE-ORDER TRAVERSING STARTED : \n");
        if(null!=root){
            System.out.print(root.data +" , ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
        // System.out.println("\n\n<<<<<<<<<<<<<<<<< PRE-ORDER TRAVERSING TERMINATED : ");

    }
    // public void postOrderTraverse(Tree.Node<?> root);
    // public void inOrderTraverse(Tree.Node<?> root);
    // public void levelOrderTraverse(Tree.Node<?> root);
    // public void breadthFirstTraverse(Tree.Node<?> root);
    // public boolean isBalanced(Tree.Node<?> root);
    // public boolean isComplete(Tree.Node<?> root);
    // public boolean isSymmetric(Tree.Node<?> root);
    // public int height(Tree.Node<?> root);
    // public int size(Tree.Node<?> root);
    // public int depth(Tree.Node<?> root);
    // public int maxDepth(Tree.Node<?> root);
    // public int minDepth(Tree.Node<?> root);
    // public int sum(Tree.Node<?> root);
    // public int product(Tree.Node<?> root);
    // public int average(Tree.Node<?> root);
    // public int median(Tree.Node<?> root);
    // public int mode(Tree.Node<?> root);
    // public <T> Tree.Node<?> find(Tree.Node<?> root, T data);
    // public Tree.Node<?> findMin(Tree.Node<?> root);
    // public Tree.Node<?> findMax(Tree.Node<?> root);
    // public <T> Tree.Node<?> remove(Tree.Node<?> root, T data);
    // public Tree.Node<?> removeMin(Tree.Node<?> root);
    // public Tree.Node<?> removeMax(Tree.Node<?> root);
    public <T> void insert(Tree.Node<?> root, T data);
    public <T> Tree.Node<?> insertMin(Tree.Node<?> root, T data);
    public <T> Tree.Node<?> insertMax(Tree.Node<?> root, T data);
    // public Tree.Node<?> rotateLeft(Tree.Node<?> root);
    // public Tree.Node<?> rotateRight(Tree.Node<?> root);
    // public Tree.Node<?> mirror(Tree.Node<?> root);
    // public Tree.Node<?> transplant(Tree.Node<?> root, Tree.Node<?> parent, Tree.Node<?> child);
}
