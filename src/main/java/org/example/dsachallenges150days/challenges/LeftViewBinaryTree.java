package org.example.dsachallenges150days.challenges;

import java.util.ArrayList;

public class LeftViewBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class Tree {
        ArrayList<Integer> leftView(Node root) {
            ArrayList<Integer> solutionList = new ArrayList<>();
            computeLeftView(root, 1, solutionList);
            return solutionList;
        }

        private void computeLeftView(Node root, int level, ArrayList<Integer> solutionList) {
            if (root == null) return;

            // If this is the first node of its level, add it to the result.
            if (level > solutionList.size()) {
                solutionList.add(root.data);
            }

            // Recur for left and right subtrees
            computeLeftView(root.left, level + 1, solutionList);
            computeLeftView(root.right, level + 1, solutionList);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        ArrayList<Integer> leftView = tree.leftView(root);
        System.out.println("Left view of binary tree:");
        for (Integer val : leftView) {
            System.out.print(val + " ");
        }
    }
}
