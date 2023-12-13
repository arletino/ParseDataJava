package ParseDataJava.Exceptions;

public class NameParseException extends NumberFormatException {
    
    public NameParseException(){
        super("Name is not corrected");
    }

    public NameParseException(String str){
        
        super(str);
    }
}
