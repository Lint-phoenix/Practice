import java.util.Stack;

public class Tree {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public class BST {
        Node root;

        public void insert(int value) {
            root = insertRecursive(root, value);
        }

        private Node insertRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }
            if (value < current.data) {
                current.left = insertRecursive(current.left, value);
            } else if (value > current.data) {
                current.right = insertRecursive(current.right, value);
            }
            return current;
        }
    }

    // Iterative Inorder Traversal
    public void inorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    // Iterative Preorder Traversal
    public void preorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            // Push right first so left is processed first
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

    // Iterative Postorder Traversal (two-stack method)
    public void postorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) stack1.push(current.left);
            if (current.right != null) stack1.push(current.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        BST bst = tree.new BST();

        // Insert nodes into BST
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(2);
        bst.insert(7);

        System.out.println("Inorder (Iterative):");
        tree.inorderIterative(bst.root);  // Output: 2 5 7 10 20

        System.out.println("\nPreorder (Iterative):");
        tree.preorderIterative(bst.root); // Output: 10 5 2 7 20

        System.out.println("\nPostorder (Iterative):");
        tree.postorderIterative(bst.root); // Output: 2 7 5 20 10
    }


//==================recursive traversal======================
//    public class traversals{
//
//        static void inorder(Node root){
//            if (root == null){
//                return;
//            }
//            inorder(root.left);
//            System.out.println(root.data + " ");
//            inorder(root.right);
//        }
//
//        static void preorder(Node root){
//            if (root == null){
//                return;
//            }
//            System.out.println(root.data + " ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//
//        static void postorder(Node root){
//            if (root == null){
//                return;
//            }
//            postorder(root.left);
//            postorder(root.right);
//            System.out.println(root.data + " ");
//        }
//    }
//=============================================================================

}
