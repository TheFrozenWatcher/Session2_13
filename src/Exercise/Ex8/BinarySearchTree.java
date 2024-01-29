package Exercise.Ex8;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getKey()+" ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }


}
