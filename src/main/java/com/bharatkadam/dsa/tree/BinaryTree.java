package com.bharatkadam.dsa.tree;

public class BinaryTree extends Tree implements BaseTree{
   public Tree.Node<?> root;

@Override
public <T> void insert(Node<?> root, T data) {
    Node<?> newNode=Tree.createNode(data);
    if(null==root){
        root=newNode;
        if(null==this.root)
            this.root=root;
    }
    else if(null==root.left){
        root.left=newNode;
    }else if(null==root.right){
        root.right=newNode;
    }else{
        if(null==root.left.left)
            insert(root.left, data);
        else if(null==root.right.right)
            insert(root.right, data);

    }

}

@Override
public <T> Node<?> insertMax(Node<?> root, T data) {
    // TODO Auto-generated method stub
    return null;
}

@Override
public <T> Node<?> insertMin(Node<?> root, T data) {
    // TODO Auto-generated method stub
    return null;
}
   
    
}
