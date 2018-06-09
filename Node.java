class Node {
    public int data;
    public Node left;
    public Node right;

    Node(int i) {
        this.data = i;
    }

    public void addNode(int num) {
        if (num < this.data) {
            if (this.left == null) {
                this.left = new Node(num);
            } else {
                this.left.addNode(num);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(num);
            } else {
                this.right.addNode(num);
            }
        }
    }

    public void traverse() {
        if (this != null) {
            if (this.left != null) {
                this.left.traverse();
            }
            System.out.println(this.data);
            if (this.right != null) {
                this.right.traverse();
            }
        }
    }

    public Node search(int num) {

        if(this.data == num){
            return this;
        }

        if (this.left != null) {
            return this.left.search(num);
        }

        if (this.right != null) {
            return this.right.search(num);
        }

        return null;
    }

    @Override
    public String toString() {
        return "Node: Data = " + this.data;
    }
}