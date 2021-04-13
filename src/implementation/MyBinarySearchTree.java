package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
     private Node root;
     public Node getRoot(){
         return root;
         
    }
    @Override
    public void insert(E data) {
         Node node = new implementation.Node(data.compareTo(data));
         if(root == null) {
             root = node;
         }
         else {
             Node temp = root;
             Node parent = null;
             while(temp!=null){
                             parent = temp;
                             if(data<= temp.ge)
             }
         }




    }

    @Override
    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
