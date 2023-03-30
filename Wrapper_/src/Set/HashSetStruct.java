package Set;
// 基础Hashmap的原理
public class HashSetStruct {
    public static void main(String[] args) {
        Node[] table = new Node[16];
        System.out.println(table);
        Node node = new Node("jack",null);
        table[2] = node;
        Node jack = new Node("jack",null);
        node.next = jack;
        Node marin = new Node("marin");
        jack.next = marin;
        System.out.println(table);

    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(Object item) {
        this.item = item;
    }
}
