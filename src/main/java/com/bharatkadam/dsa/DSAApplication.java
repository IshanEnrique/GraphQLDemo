package com.bharatkadam.dsa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bharatkadam.dsa.input.Input;
import com.bharatkadam.dsa.tree.BinaryTree;

@SpringBootApplication(scanBasePackages = "com.bharatkadam.dsa.*")
public class DSAApplication implements CommandLineRunner {
	@Autowired
	private Input input;

	public static void main(String[] args) {
		SpringApplication.run(DSAApplication.class, args);
		System.out.println("\n\n******************** DSA APPLICATION STARTED SUCCESSFULLY *****************************\n\n");
		System.exit(0);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.printf("\n Input : %s ",input);
		BinaryTree binaryTree=new BinaryTree();
		input.getItems().getValues().stream().forEach((data)-> binaryTree.insert(binaryTree.root, data));
        System.out.println("\n\n>>>>>>>>>>>> PRE-ORDER TRAVERSING STARTED : \n");
		binaryTree.preOrderTraverse(binaryTree.root);
        System.out.println("\n\n<<<<<<<<<<<<<<<<< PRE-ORDER TRAVERSING TERMINATED : ");

	}

}
