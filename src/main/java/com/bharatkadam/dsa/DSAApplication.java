package com.bharatkadam.dsa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bharatkadam.dsa.input.Input;
import com.bharatkadam.dsa.tree.BinaryTree;

@SpringBootApplication(scanBasePackages = "com.bharatkadam.dsa.*")
public class DSAApplication implements CommandLineRunner {
	private static Logger LOGGER=LoggerFactory.getLogger(DSAApplication.class);
	@Autowired
	private Input input;

	public static void main(String[] args) {
		SpringApplication.run(DSAApplication.class, args);
		LOGGER.info("\n\n******************** DSA APPLICATION STARTED SUCCESSFULLY *****************************\n\n");
		System.exit(0);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("\n Input : {} ",input);
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.root=binaryTree.createBinaryTree(input.getItems().getValues());
		// input.getItems().getValues().stream().forEach((data)-> binaryTree.insert(binaryTree.root, data));
		BinaryTree.traverse(binaryTree);


	}

}
