package org.learn.Client;

import org.learn.Question.MinAndMaxInBST;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(100);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(150);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(80);
		Node F = Node.createNode(125);
		Node G = Node.createNode(170);

		// Level 3
		Node H = Node.createNode(10);
		Node I = Node.createNode(30);
		Node J = Node.createNode(60);
		Node K = Node.createNode(90);
		Node L = Node.createNode(110);
		Node M = Node.createNode(140);

		// connect Level 0 and 1
		A.left  = B;
		A.right = C;
		
		// connect level 1 and level 2
		B.left  = D;
		B.right = E;
		C.left  = F;
		C.right = G;

		// connect level 1 and level 2
		D.left  = H;
		D.right = I;
		E.left  = J;
		E.right = K;
		F.left  = L;
		F.right = M;
		
		System.out.println("Min value in Binary Tree is : " + MinAndMaxInBST.min(A));
		System.out.println("Max value in Binary Tree is : " + MinAndMaxInBST.max(A));
	}
}
