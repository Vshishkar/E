package by.tc.task04.util;

import by.tc.task04.entity.Node;
import by.tc.task04.service.NodeFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class XMLAnalyzerImpl implements XMLAnalyzer {

    private FileReader fileReader;
    private String currentString;
    private Scanner scanner;

    public XMLAnalyzerImpl(File file) throws FileNotFoundException {

        this.fileReader = new FileReader(file);
        this.scanner = new Scanner(fileReader);

    }


    public boolean hasNext(){
        return this.scanner.hasNext();
    }



    @Override
    public Node getNextNode() {

        if(!scanner.hasNext()){
            return null;
        }
        if(currentString == null || currentString.equals("")){
            currentString = scanner.nextLine();
            currentString = currentString.trim();
        }

        String nodeString = getNodeString(this.currentString);

        if(nodeString == null || nodeString.equals("")){
            currentString +=scanner.nextLine();
            currentString = currentString.trim();
            return getNextNode();
        }

        cutCurrentString(nodeString);

        NodeFactory nodeFactory = new NodeFactory(nodeString);

        return nodeFactory.createNode();
    }


    private void cutCurrentString(String s){
        if(s != null){
            int length = s.length();
            currentString = currentString.substring(length);
        }
    }

    private static String getNodeString(String currentString){

        int openTagIndex = currentString.indexOf('<');

        if(openTagIndex == 0){
            int closeTagIndex = currentString.indexOf('>');
            if(closeTagIndex == -1){
                return null;
            }
            return currentString.substring(openTagIndex,closeTagIndex + 1);
        }
        if(openTagIndex != -1){
            return currentString.substring(0,openTagIndex);
        }
        else {
            return currentString;
        }
    }


    @Override
    public void close() throws IOException {
            this.fileReader.close();
    }
}
