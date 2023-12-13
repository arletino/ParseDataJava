package ParseDataJava.View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteOnFile implements AutoCloseable {
    
    private String path = "test.txt";
    private File file;
    private boolean flag = true; 

    public ReadWriteOnFile(){
    }

    public void setPathFile(String path){
        this.path = path + ".txt";
    }

    public void writeOnFile(String data) throws IOException{
        this.file = new File(this.path);
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
        flag = false;

    }

    @Override
    public void close() throws IOException {
        if(flag){
            throw new IOException("File not saved");
        }
    }


}
