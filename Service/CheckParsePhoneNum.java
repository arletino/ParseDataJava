package ParseDataJava.Service;

public class CheckParsePhoneNum implements CheckParseData {
    
    @Override
    public boolean checkInputData(String phoneNum) {
       return phoneNum.matches("\\d{11}");
    }

}
