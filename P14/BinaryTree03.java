package P14;

public class BinaryTree03 {
    Node03 root;

    public BinaryTree03() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new Node03(data);
        } else {
            Node03 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node03(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node03(data);
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


    public void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    private Node03 addRecursive(Node03 current, int data) {
        if (current == null) {
            return new Node03(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }

        return current;
    }



    public void inOrderRecursive(Node03 root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderRecursive(root.right);
        }
    }

    public boolean find(int data) {
        boolean result = false;
        Node03 current = root;
        while (current != null) {
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

    void traversePreOrder(Node03 node) {
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node03 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node03 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    Node03 getSuccessor(Node03 del) {
        Node03 Successor = del.right;
        Node03 SuccessorParent = del;
        while (Successor.left != null) {
            SuccessorParent = Successor;
            Successor = Successor.left;
        }
        if (Successor != del.right) {
            SuccessorParent.left = Successor.right;
            Successor.right = del.right;
        }
        return Successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        Node03 parent = root;
        Node03 current = root;
        boolean isLeftChild = false;

        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data not found");
            return;
        }

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
        }

        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        }

        else {
            Node03 successor = getSuccessor(current);

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