package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //complete node class
        private int data;
        private Node left;
        private Node right;
        private int height;

        // constructor
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
            height = 0;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

