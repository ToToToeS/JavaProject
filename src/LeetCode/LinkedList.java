package LeetCode;

public class LinkedList {

    Node firstNode;
    Node lastNode;

    private class Node {
        int val;
        Node next;

        Node() {};
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.next = next; }
    }

    public LinkedList() { this.firstNode = new Node(); this.lastNode = firstNode; }
    LinkedList(int val) { this.firstNode = new Node(val); this.lastNode = firstNode; }

    void add(int val) {
        Node nNode = new Node(val);
        this.lastNode.next = nNode;
        this.lastNode = nNode;
    }
    int get(int index) {
        Node node = firstNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }
    void setNode(int index, int val) {
        Node node = firstNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.val = val;
    }
    void del(int index) {
        Node node = this.firstNode;
        Node backNode;

        for (int i = 0; i < index; i++) {
            if (i == index - 2) {
                backNode = node;
                node = node.next;
                node = node.next;
                backNode.next = node;
            }else node = node.next;

        }
    }
}
