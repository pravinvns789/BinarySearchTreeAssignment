package main;
import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);
        bst.insert(35);
        bst.insert(40);
        System.out.println(bst.height(bst.getRoot()));
        System.out.println();
        bst.delete(50);
        System.out.println();
        System.out.println();
        //create binary search tree
        // and perform insert, search, traversal, delete
    }
}
