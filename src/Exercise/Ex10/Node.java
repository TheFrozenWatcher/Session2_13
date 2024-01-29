package Exercise.Ex10;

public class Node {
    private int key;
    private Exercise.Ex8.Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Exercise.Ex8.Node getLeft() {
        return left;
    }

    public void setLeft(Exercise.Ex8.Node left) {
        this.left = left;
    }

    public Exercise.Ex8.Node getRight() {
        return right;
    }

    public void setRight(Exercise.Ex8.Node right) {
        this.right = right;
    }

}
