class Tree {

    private Node root;

    public void add(int num) {
        if (this.root == null) {
            this.root = new Node(num);
        } else {
            if (num < this.root.data) {
                // Go Left
            } else {
                // Go Right
            }
        }
    }

    public static void print(String m) {
        System.out.println(m);
    }

    public static void main(String[] args) {
        System.out.println("#################### TREE ###################");

        Tree tree = new Tree();
        tree.add(5);
    }

}