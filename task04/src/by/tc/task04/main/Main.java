package by.tc.task04.main;

import by.tc.task04.entity.Node;
import by.tc.task04.util.XMLAnalyzer;
import by.tc.task04.util.XMLAnalyzerImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    private static String root = System.getProperty("user.dir");
    private static String src = "/notes.xml";

    public static void main(String[] args)  {

        File file = new File(root + src);

        XMLAnalyzer xmlAnalyzer = null;

        try {
            xmlAnalyzer = new XMLAnalyzerImpl(file);

            while ( xmlAnalyzer.hasNext()){
                Node node =  xmlAnalyzer.getNextNode();
                NodePrinter.printNode(node);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            try {
                xmlAnalyzer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


