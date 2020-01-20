package files;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesIO {

    public void createFile(String filename) throws IOException {

        File myFile=new File(filename +".txt");
        try {
            if (myFile.createNewFile()){
                System.out.println("File created: "+myFile.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("Error!!!");
            e.printStackTrace();
        }
    }


    public void fileInfo(String fileName){
        File myFile=new File(fileName +".txt");
        if(myFile.exists()){
            System.out.println("File name: "+myFile.getName());
            System.out.println("Absolute path: "+myFile.getAbsolutePath());
            System.out.println("Writeable: "+myFile.canWrite());
            System.out.println("File size in bytes: "+myFile.length());
        }else System.out.println("File does not exist");
    }

    public void writeFile(String fileName,String value) throws IOException {
        try {
            FileWriter myWrite=new FileWriter(fileName+".txt");
            myWrite.write(value);
        }catch (IOException e){
            System.out.println("Error!!");
        }
    }
}
