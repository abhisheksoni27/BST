import java.util.Random;

class BinarySearchTree {

    private Node root;

    public void add(int num) {
        if (this.root == null) {
            this.root = new Node(num);
        } else {
            this.root.addNode(num);
        }
    }

    public void search(int num) {
        Node found = this.root.search(num);

        if (found != null) {
            print(found.toString());
        } else {
            print("Not Found.");
        }
    }

    public int minimum() {
        return this.root.findMin(Double.POSITIVE_INFINITY);
    }

    public void printRoot() {
        print("Root = " + String.valueOf(this.root.data));
    }

    public static void main(String[] args) {
        System.out.println("#################### TREE ###################");

        BinarySearchTree tree = new BinarySearchTree();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            tree.add(rand.nextInt(100));
        }

        tree.toString();
        tree.printRoot();

        print("Minimum = " + String.valueOf((tree.minimum())));
    }

    @Override
    public String toString() {
        this.root.traverse();
        return "";
    }

    public static void print(String m) {
        System.out.println(m);
    }

}