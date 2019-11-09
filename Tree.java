import java.util.*;

public class Tree {
    Node root;

    private class Node {
        int data;
        ArrayList<Node> children;
        Node parent;

        public Node(int data, ArrayList<Node> children, Node parent) {
            this.data = data;
            this.children = children;
            this.parent = parent;
        }

        public int getData() {
            return data;
        }

        public ArrayList<Node> getChildren(){
            return this.children;
        }

        public Node getParent() {
            return parent;
        }


    }

    public void addRoot (int data){
        if(root == null){
            root = new Node(data,new ArrayList<>(),null);
        }
        else{
            throw new IllegalStateException("Cannot add a new node as root");
        }
    }

    public Node addNode(int data, Node parent){
        if(parent == null){
            new IllegalStateException("cannot to add to an empty parent");
        }
        Node nodeToAdd = new Node(data, new ArrayList<>(),parent);
        parent.getChildren().add(nodeToAdd);
        return nodeToAdd;
    }

    public Node getRoot(){
        return root;
    }

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.addRoot(1);
        Node node1 = tree.getRoot();
        Node node2 = tree.addNode(2,node1);
        Node node3 = tree.addNode(3,node1);

    }

}


