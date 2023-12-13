package ParseDataJava.Exceptions;

public class QuantityFieldsException extends NumberFormatException{
    public QuantityFieldsException(){
        super("Input data is not correct");
    }

    public QuantityFieldsException(String str){
        super(str);
    }
}
