import java.util.Random;

class Tree {

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

    public static void main(String[] args) {
        System.out.println("#################### TREE ###################");

        Tree tree = new Tree();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            tree.add(rand.nextInt(100));
        }

        tree.toString();
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