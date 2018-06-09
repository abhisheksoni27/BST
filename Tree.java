class Tree {

    private Node root;

    public void add(int num) {
        if (this.root == null) {
            this.root = new Node(num);
        } else {
            this.root.addNode(num);
        }
    }

    public Node search(int num) {
        return this.root.search(num);
    }

    @Override
    public String toString() {
        this.root.traverse();
        return "";
    }

    public static void print(String m) {
        System.out.println(m);
    }

    public static void main(String[] args) {
        System.out.println("#################### TREE ###################");

        Tree tree = new Tree();
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.add(4);
        tree.add(5);

        Node found = tree.search(3);

        if (found != null) {
            print(found.toString());
        } else {
            print("Not Found.");
        }
        // tree.toString();
    }

}