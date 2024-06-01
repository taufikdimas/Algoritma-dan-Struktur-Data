package Tree;

class BinaryTree26 {
    Node26 root;

    public BinaryTree26() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // Perbaikan di sini
            root = new Node26(data);
        } else {
            Node26 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node26(data); // Perbaikan di sini
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node26(data); // Perbaikan di sini
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node26 current = root;
        while (current != null) { // Perbaikan di sini
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node26 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node26 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node26 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    Node26 getSuccessor(Node26 del) {
        Node26 successor = del.right;
        Node26 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node26 parent = root;
        Node26 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("couldn't find data");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // Perbaikan di sini
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // Perbaikan di sini
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node26 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }

    // Tugas
    // Method untuk menambahkan node secara rekursif
    private Node26 addRekursif(Node26 current, int data) {
        if (current == null) {
            return new Node26(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    public void addRekursif(int data) {
        root = addRekursif(root, data);
    }

    // Method untuk menampilkan nilai paling kecil dalam tree
    public int findMinValue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tree is empty");
        }

        Node26 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Method untuk menampilkan nilai paling besar dalam tree
    public int findMaxValue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tree is empty");
        }
        Node26 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // Method untuk menampilkan data yang ada di leaf
    public void printLeaf() {
        printLeaf(root);
    }

    private void printLeaf(Node26 node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        printLeaf(node.left);
        printLeaf(node.right);
    }

    // Method untuk menghitung jumlah leaf dalam tree
    public int countLeaf() {
        return countLeaf(root);
    }

    private int countLeaf(Node26 node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return countLeaf(node.left) + countLeaf(node.right);
    }
}
