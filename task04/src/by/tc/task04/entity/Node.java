package by.tc.task04.entity;

public class Node {

    private NodeType type;

    private String context;

    public Node() {
    }

    public Node(NodeType type, String context) {
        this.type = type;
        this.context = context;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Node{" +
                "type=" + type +
                ", context='" + context + '\'' +
                '}';
    }
}

