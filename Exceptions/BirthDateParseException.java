package ParseDataJava.Exceptions;



public class BirthDateParseException extends NumberFormatException{

    public BirthDateParseException() {
        super("Format date is not valid");
    }
    public BirthDateParseException(String str) {
        super(str);
    }
    
}
