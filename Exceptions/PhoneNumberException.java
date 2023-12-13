package ParseDataJava.Exceptions;

public class PhoneNumberException extends NumberFormatException{

    public PhoneNumberException(){
        super("Phone number is not corrected");
    }
    
    public PhoneNumberException(String str){
        super(str);
    }
}
