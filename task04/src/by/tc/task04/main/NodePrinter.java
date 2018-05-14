package by.tc.task04.main;

import by.tc.task04.entity.Node;

public class NodePrinter {

    public static void printNode(Node node){
        System.out.println(node.getContext() + " : " + node.getType());
    }
}
