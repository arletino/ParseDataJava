package ParseDataJava.View;

import java.util.Scanner;

public class ReadWriteOnConsole {
    private String inString = "";
    private Scanner scanner = new Scanner(System.in);

    
    public ReadWriteOnConsole(){
        this.scanner = new Scanner(System.in);   
    }

    public void readOnConsole(){
        inString = scanner.nextLine();
    }

    public void writeOnConsole(String str){
        System.out.println(str);
    }

    public void scannerClose(){
        scanner.close();
    }
    
    public String getStrOnConsole(){
        return this.inString;

    }

}
