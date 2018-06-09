class Node {
    public int data;
    public Node left;
    public Node right;

    Node(int i) {
        this.data = i;
    }

    public void addNode(int num) {
        if (num < this.data) {
            this.left = new Node(num);
        } else {
            this.right = new Node(num);
        }
    }
}