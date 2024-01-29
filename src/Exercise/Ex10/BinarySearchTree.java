package Exercise.Ex10;

import Exercise.Ex8.Node;

public class BinarySearchTree {
    Node root;

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null || root.getKey() == key) {
            return root != null;
        }
        if (key < root.getKey()) {
            return searchRec(root.getLeft(), key);
        }
        return searchRec(root.getRight(), key);
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(27);
        tree.root.setLeft(new Node(14));
        tree.root.setRight(new Node(35));
        tree.root.getLeft().setLeft(new Node(10));
        tree.root.getLeft().setRight(new Node(19));
        tree.root.getRight().setLeft(new Node(31));
        tree.root.getRight().setRight(new Node(42));

        System.out.println(tree.search(14));
        System.out.println(tree.search(24));
    }
}
