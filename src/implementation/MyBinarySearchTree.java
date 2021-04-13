package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    Node<E> root;

    @Override
    public void insert(E data) {
        if (root == null)
            root = new Node<>(data);
        else {
            Node<E> current = root;
            Node<E> temp = new Node<>(data);
            while (true) {
                if (data.compareTo(current.data) <= 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
                if (current == null) {
                    current = temp;
                    break;
                }
            }
        }
    }

    @Override
    public boolean search(E searchElement) {
        Node<E> current = root;
        while (current != null) {
            if (searchElement.compareTo(current.data) == -1)
                current = current.left;
            else if (searchElement.compareTo(current.data) == 1)
                current = current.right;
            else
                return true;
        }
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    @Override
    public void preOrder(Node<E> node) {
        if (node == null)
            return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void postOrder(Node<E> node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    @Override
    public void reverseInOrder(Node<E> node) {
        if (node == null)
            return;
        reverseInOrder(node.right);
        System.out.println(node.data);
        reverseInOrder(node.left);
    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        if (node == null)
            return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}