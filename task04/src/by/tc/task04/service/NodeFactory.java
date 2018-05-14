package by.tc.task04.service;

import by.tc.task04.entity.Node;
import by.tc.task04.entity.NodeType;

public class NodeFactory {

    private String nodeString;

    public NodeFactory(String nodeString) {
        this.nodeString = nodeString;
    }

    public String getNodeString() {
        return nodeString;
    }

    public void setNodeString(String nodeString) {
        this.nodeString = nodeString;
    }

    public Node createNode(){

        Node node = new Node();

        if(isTag()){
            if(isCloseTag()){
                node.setType(NodeType.CLOSE_TAG);
            }
            else if(isNonBodyTag()){
                node.setType(NodeType.NON_BODY_TAG);
            }
            else {
            node.setType(NodeType.OPEN_TAG);
            }
        }
        else {
            node.setType(NodeType.CONTENT_TAG);
        }
        node.setContext(nodeString);

        return node;
    }

   public boolean isTag(){

        if(nodeString.indexOf('<') == 0) return true;
        return false;
    }

   public boolean isNonBodyTag(){
        int len = nodeString.length();
        if(nodeString.charAt(len - 2) == '/') return true;
        else return false;
   }

   public boolean isCloseTag(){
        if(nodeString.charAt(1) == '/') return true;
        return false;
    }
}
