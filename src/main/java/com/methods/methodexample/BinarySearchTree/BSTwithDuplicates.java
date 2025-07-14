
package com.methods.methodexample.BinarySearchTree;
    // Node class for the tree


    public class BSTwithDuplicates {
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

    public BSTwithDuplicates() {
        root = null;
    }
    
    void insert(int key){
        root = insert(root, key);
    }
            
            

        Node root;  //5,2,8

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
        
        bst.insert(5);
        bst.insert(9);
        bst.insert(3);
        bst.insert(1);
        
        bst.inOrder(bst.root);

                
    }

    }


