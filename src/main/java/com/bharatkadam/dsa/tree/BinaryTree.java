package com.bharatkadam.dsa.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

public class BinaryTree extends Tree implements BaseTree{
   private static Logger LOGGER=LoggerFactory.getLogger(BinaryTree.class);
   public Tree.Node<?> root;
   private Integer size;
    public  <T> Node<?> createBinaryTree(List<T> data){
        Integer position=size;
        if(null==position){
            LOGGER.info("Postion null : initialized with -1");
            position=-1;
        }
        position++;
        LOGGER.info("current position : "+position);
        if(CollectionUtils.isEmpty(data)|| position>=data.size()||null==data.get(position))
        {
            LOGGER.info("returning due to : CollectionUtils.isEmpty(data) : "+(CollectionUtils.isEmpty(data))+" , position>=data.size() : "+(position>=data.size())+(position>=data.size()?" , POSITION IS HIGH FROM SIZE ":" , null==data.get(position) : "+(null==data.get(position))));
            return null;
        }
        Tree.Node<?> node=createNode(data.get(position));
        LOGGER.info("New node created : data : ["+node.data+"]"+" , position : "+position+" \n CALLING LEFT SUBTREE");
        size=position;
        node.left=createBinaryTree(data);
        LOGGER.info(node.left==null?"LEFT NODE FOUND NULL":"LEFT node created : data : ["+node.left.data+"]"+" , position : "+position+" \n CALLING RIGHT SUBTREE");
        node.right=createBinaryTree(data);
        LOGGER.info(node.right==null?"RIGHT NODE FOUND NULL":"RIGHT node created : data : ["+node.right.data+"]"+" , position : "+position+" \n RETURNING ");
        return node;
    }
    public static void traverse(BinaryTree binaryTree){
        if(null==binaryTree|| null==binaryTree.root){
            LOGGER.info(">>>>>>>>>>> \n\n\n NOTHING TO TRAVERSE IN THE GIVEN BINARY TREE. ");
            return;
        }
        LOGGER.info("\n\n>>>>>>>>>>>> PRE-ORDER TRAVERSING STARTED : \n");
		binaryTree.preOrderTraverse(binaryTree.root);
        LOGGER.info("\n\n<<<<<<<<<<<<<<<<< PRE-ORDER TRAVERSING TERMINATED : ");

        // LOGGER.info("\n\n>>>>>>>>>>>> POST-ORDER TRAVERSING STARTED : \n");
		// binaryTree.postOrderTraverse(binaryTree.root);
        // LOGGER.info("\n\n<<<<<<<<<<<<<<<<< POST-ORDER TRAVERSING TERMINATED : ");

        // LOGGER.info("\n\n>>>>>>>>>>>> IN-ORDER TRAVERSING STARTED : \n");
		// binaryTree.inOrderTraverse(binaryTree.root);
        // LOGGER.info("\n\n<<<<<<<<<<<<<<<<< IN-ORDER TRAVERSING TERMINATED : ");

        // LOGGER.info("\n\n>>>>>>>>>>>> LEVEL-ORDER TRAVERSING STARTED : \n");
		// binaryTree.levelOrderTraverse(binaryTree.root);
        // LOGGER.info("\n\n<<<<<<<<<<<<<<<<< LEVEL-ORDER TRAVERSING TERMINATED : ");
    }

@Override
public <T> void insert(Node<?> root, T data) {
   Node<?> newNode= createNode(data);
   if(null==this.root){
    this.root=newNode;
    return;
   }
   Queue<Node<?>> queue= new LinkedList<>();
   queue.add(this.root);
   while(!queue.isEmpty()){
    Node<?> node=queue.remove();
    if(null==node.left){
     node.left=newNode;
     break;
    }
    if(null==node.right){
     node.right=newNode;
     break;
    }
    queue.add(node.left);
    queue.add(node.right);
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
