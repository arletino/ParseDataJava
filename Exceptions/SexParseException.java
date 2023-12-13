package ParseDataJava.Exceptions;

public class SexParseException extends NumberFormatException {
    
    public SexParseException(){
        super("Sex input not corrected");
    }

    public SexParseException(String str){
        super(str);
    }
}
