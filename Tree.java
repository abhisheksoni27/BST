class Tree {

    private Node root;

    public void add(int num) {
        if (this.root == null) {
            this.root = new Node(num);
        } else {
            this.root.addNode(num);
        }
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
        tree.add(17);
        tree.add(5);
        tree.add(2);
        tree.add(7);
        tree.add(71);
        tree.add(0);

        tree.toString();
    }

}