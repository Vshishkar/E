package by.tc.task04.util;

import by.tc.task04.entity.Node;

import java.io.IOException;

public interface XMLAnalyzer {

    Node getNextNode();

    void close() throws IOException;

    boolean hasNext();
}
