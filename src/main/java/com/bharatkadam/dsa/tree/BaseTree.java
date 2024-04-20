package com.bharatkadam.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BaseTree {
    public static Logger LOGGER=LoggerFactory.getLogger(BaseTree.class);
    public default void preOrderTraverse(Tree.Node<?> root){
        if(null!=root){
            LOGGER.info(root.data +"  ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }
    public default void postOrderTraverse(Tree.Node<?> root){
        if(null!=root){
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            LOGGER.info(root.data +"  ");
        }
    }
    public default void inOrderTraverse(Tree.Node<?> root){
        if(null!=root){
            inOrderTraverse(root.left);
            LOGGER.info("{}  ",root.data );
            inOrderTraverse(root.right);
        }
    }
    public default void levelOrderTraverse(Tree.Node<?> root){
        if(null!=root){
            Queue<Tree.Node<?>> queue= new LinkedList<>();
            StringBuilder message=new StringBuilder();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()){
                Tree.Node<?> node=queue.remove();
                if(null==node){
                    message.append("\n");
                    LOGGER.info(message.toString());
                    if(!queue.isEmpty()){
                        queue.add(null);
                        message=new StringBuilder();
                    }
                }else{
                    message.append(node.data+"  ");
                    if(null!=node.left){
                        queue.add(node.left);
                    }
                    if(null!=node.right){
                        queue.add(node.right);
                    }
                }
            }
        }
    }
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
