public class BST{

    class Node implements Comparable<Node>{
        Car key;
        Node left, right;
        public Node(Car item) {
            key = item;
            left = right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.key.compareTo(o.key);
        }
    }

    Node root;

    BST(){ this.root = null; }

    void insert(Car key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, Car key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key.compareTo(root.key)< 0) root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key)>0) root.right = insertRec(root.right, key);
        return root;
    }

    void deleteNode(Car key){ root = deleteNodeRec(root, key); }

    Node deleteNodeRec(Node root, Car key){

        if(root == null) return null;
        if (key == root.key){
            if(root.left == null && root.right == null) return null;
            else if (root.left != null && root.right == null) return root.left;
            else if (root.left == null) return root.right;
            else {
                root.key = getMinValue(root.right);
                root.right = deleteNodeRec(root.right, root.key);
            }
        }
        if (key.compareTo(root.key)< 0) root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key)>0) root.right = insertRec(root.right, key);
        return root;
    }

    Car getMinValue(Node root)
    {
        Car car = root.key;
        while (root.left != null)
        {
            car = root.left.key;
            root = root.left;
        }
        return car;
    }

    void printInorder()  {
        printInorderRec(root);
    }

    void printInorderRec(Node root) {
        if (root != null) {
            printInorderRec(root.left);
            System.out.println(root.key);
            printInorderRec(root.right);
        }
    }
}
