package main.java;

import parser.Parser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FacadeParser {
    public void startParse(String path) {
        Parser parser = new Parser();
        File filePath = new File(path);
        try {
            Scanner scanner = new Scanner(filePath);
            parser.startParse(scanner);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
