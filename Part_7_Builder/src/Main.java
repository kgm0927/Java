


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            
            String result = textbuilder.getTextResult();
            System.out.println(result);
            
        } else if (args[0].equals("html")) {
        	
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            
            director.construct();
            String filename = htmlbuilder.getHTMLResult();
            System.out.println("HTML:" + filename );
            
        } else {
            usage();
            System.exit(0);
        }
    }

   
    public static void usage() {
        System.out.println("Usage: java Main text     ");
        System.out.println("Usage: java Main html      ");
    }
}
// javac -encoding UTF-8 YourJavaFile.java
// java -Dfile.encoding=UTF-8 Main


/*
 * Main.java
 * 
 * 
 * */
 