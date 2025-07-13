/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinarySearchTree;

/**
 *
 * @author A-3
 */
public class BSTGrokAi {
    // Node class for the tree
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BSTGrokAi() {
        root = null;
    }

    // Insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive insert helper
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

//    // Search for a key
//    boolean search(int key) {
//        return searchRec(root, key);
//    }
//
//    // Recursive search helper
//    boolean searchRec(Node root, int key) {
//        if (root == null || root.key == key)
//            return root != null;
//
//        if (key < root.key)
//            return searchRec(root.left, key);
//        return searchRec(root.right, key);
//    }
//
//    // Delete a key
//    void delete(int key) {
//        root = deleteRec(root, key);
//    }
//
//    // Recursive delete helper
//    Node deleteRec(Node root, int key) {
//        if (root == null)
//            return root;
//
//        if (key < root.key)
//            root.left = deleteRec(root.left, key);
//        else if (key > root.key)
//            root.right = deleteRec(root.right, key);
//        else {
//            // Node with only one child or no child
//            if (root.left == null)
//                return root.right;
//            else if (root.right == null)
//                return root.left;
//
//            // Node with two children
//            root.key = minValue(root.right);
//            root.right = deleteRec(root.right, root.key);
//        }
//        return root;
//    }
//
//    // Find minimum value in a subtree
//    int minValue(Node root) {
//        int minv = root.key;
//        while (root.left != null) {
//            minv = root.left.key;
//            root = root.left;
//        }
//        return minv;
//    }

    // Inorder traversal
    
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    // Recursive inorder helper
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BSTGrokAi tree = new BSTGrokAi();

        // Insert some values
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print inorder traversal
        System.out.println("Inorder traversal of the BST:");
        tree.inorder();

        // Search for a key
//        System.out.println("Search for 40: " + tree.search(40));
//        System.out.println("Search for 90: " + tree.search(90));

        // Delete a key
        System.out.println("Deleting 20...");
//        tree.delete(20);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }
}
