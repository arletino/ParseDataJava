package ParseDataJava.Controller;

import java.io.IOException;

import ParseDataJava.Service.ParsePersonData;
import ParseDataJava.View.ReadWriteOnConsole;
import ParseDataJava.View.ReadWriteOnFile;

public class Controller {
    ReadWriteOnConsole readWriteOnConsole = new ReadWriteOnConsole();
    ParsePersonData parsePersonData;

    public void readDataOnConsole(){
        readWriteOnConsole.readOnConsole();
    }

    public void getPerson(){
        String data = readWriteOnConsole.getStrOnConsole();
        parsePersonData = new ParsePersonData(data);
        if(parsePersonData.getListExceptions().isEmpty()){
            System.out.println(parsePersonData.getPerson().toString());
            writeDataFile();
        }else{
            System.out.println(parsePersonData.getListExceptions());
        }
    }

    public void writeOnConsole(String str){
        readWriteOnConsole.writeOnConsole(str);
    }

    public void writeDataFile(){
        String fileName = parsePersonData.getPerson().getFirstName();
        String text =  parsePersonData.getPerson().toFile();
        try (ReadWriteOnFile readWriteOnFile = new ReadWriteOnFile();){
            readWriteOnFile.setPathFile(fileName);
            readWriteOnFile.writeOnFile(text);
            System.out.println("File saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
