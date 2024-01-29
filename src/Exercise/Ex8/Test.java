package Exercise.Ex8;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(27);
        tree.root.setLeft(new Node(14));
        tree.root.setRight(new Node(35));
        tree.root.getLeft().setLeft(new Node(10));
        tree.root.getLeft().setRight(new Node(19));
        tree.root.getRight().setLeft(new Node(31));
        tree.root.getRight().setRight(new Node(42));

        System.out.println("Duyệt theo thứ tự pre order:");
        tree.preOrderTraversal(tree.root);
    }

}
