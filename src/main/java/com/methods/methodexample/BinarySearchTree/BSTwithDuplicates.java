/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinarySearchTree;

/**
 *
 * @author A-3
 */

    


    // Node class for the tree
    class Node {

        int key;
        int count; // to handles duplicates
        Node left, right;

        public Node(int item) {
            key = item;
            count = 1;
            left = right = null;
        }

    }

    public class BSTwithDuplicates {

        Node root;  //5

        Node insert(Node node, int key) {
            if (node == null) {
                return new Node(key);
            }
            if (key < node.key) {
                node.left = insert(node.left, key);
            } else if (key > node.key) {
                node.right = insert(node.right, key);
            } else {
                node.count++;
            }
            return node;
        }

        boolean search(Node node, int key) {
            if (node == null) {
                return false;
            }
            if (node.key == key) {
                return true;
            }
            return key < node.key ? search(node.left, key) : search(node.right, key);
        }

        //In-Order
        void inOrder(Node node) {
            if (node != null) {
                inOrder(node.left);
                for (int i = 0; i < node.count; i++) {
                    System.out.println(node.key + " ");
                }
                inOrder(node.right);
            }
        }
        
        public static void main(String[] args) {
        BSTwithDuplicates bst = new BSTwithDuplicates();
        
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 3);
        bst.root = bst.insert(bst.root, 4);
        bst.inOrder(bst.root);
                
    }

    }


