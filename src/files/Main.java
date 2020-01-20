package files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilesIO myFile=new FilesIO();
        //myFile.createFile("EX1");
        //myFile.fileInfo("EX1");
        myFile.writeFile("EX1","This is first file");
        //myFile.createFile("EX1");
    }
}
