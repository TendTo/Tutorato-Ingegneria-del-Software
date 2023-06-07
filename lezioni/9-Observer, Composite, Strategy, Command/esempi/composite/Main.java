class Main {
    public static void main(String[] args) {
        Node root = new SubTree(1);
        Node child1 = new SubTree(2);
        Node child2 = new SubTree(3);
        Node child3 = new Leaf(4);
        Node child4 = new Leaf(5);
        Node child5 = new Leaf(6);
        Node child6 = new Leaf(7);

        /**
         *             1
         *          /     \
         *         2       3
         *        / \     / \
         *       4   5   6   7
         */

        ((SubTree) root).addChild(child1);
        ((SubTree) root).addChild(child2);
        ((SubTree) child1).addChild(child3);
        ((SubTree) child1).addChild(child4);
        ((SubTree) child2).addChild(child5);
        ((SubTree) child2).addChild(child6);

        System.out.println("The sum is: " + root.getSum());
    }
}