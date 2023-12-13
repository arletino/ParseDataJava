package ParseDataJava.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ParseDataJava.Data.Person;
import ParseDataJava.Exceptions.BirthDateParseException;
import ParseDataJava.Exceptions.NameParseException;
import ParseDataJava.Exceptions.PhoneNumberException;
import ParseDataJava.Exceptions.QuantityFieldsException;

public class ParsePersonData{
    
    private CheckParseBirthDate checkParseBirthDate = new CheckParseBirthDate();
    private CheckParseName checkParseName = new CheckParseName();
    private CheckParsePhoneNum checkParsePhoneNum = new CheckParsePhoneNum();
    private CheckParseSex checkParseSex = new CheckParseSex();
    private CheckQuantityFields checkQuantityFields = new CheckQuantityFields();
    private Person person = new Person();
    private List<Exception> listExceptions = new ArrayList<>();

    public List<Exception> getListExceptions() {
        return listExceptions;
    }

    public Person getPerson() {
        return person;
    }

    public ParsePersonData(String data){
        String[] fields;
        if (checkQuantityFields.checkInputData(data)){
            fields = checkQuantityFields.getParseData();
            if (!recognizeFields(fields)){
                System.out.println(("Data not recognize"));
                System.out.println(person.toString());
            }     
        }else{
            throw new QuantityFieldsException("Data not recognize, wrong quantity of fields");
        }
    } 

    public boolean recognizeFields(String[] fields){
        boolean firstName = false;
        boolean secondName = false;
        boolean lastName = false;
        boolean birthDate = false;
        boolean phoneNum = false;
        boolean sex = false;

        for (String string : fields) {
            if (checkParseName.checkInputData(string) && !firstName){
                firstName = true;
                person.setFirstName(string);
            }else if (checkParseName.checkInputData(string) && !secondName){
                person.setSecondName(string);
                secondName = true;
            }else if (checkParseName.checkInputData(string) && !lastName){
                person.setLastName(string);
                lastName =true;
            }else if(checkParseBirthDate.checkInputData(string) && !birthDate){
                try {
                    checkParseBirthDate.parsDate(string);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Date date = checkParseBirthDate.getBirthDate();
                birthDate = true;
                person.setBirthDate(date);
            }else if (checkParsePhoneNum.checkInputData(string) && !phoneNum){
                person.setPhoneNumber(string);
                phoneNum = true;
            }else if (checkParseSex.checkInputData(string) && !sex){
                person.setSex(string);
                sex = true;
            }
        }
        
        if(firstName && secondName && lastName && birthDate && phoneNum && sex){
            return true;
        }else {
            if (!firstName){
                this.listExceptions.add(new NameParseException("First name not found or not corrected format\""));
            }if (!secondName){
                this.listExceptions.add(new NameParseException("Second name not found or not corrected format\""));
            }if (!lastName){
               this.listExceptions.add(new NameParseException("Second name not found or not corrected format\""));
            }if(!birthDate){
                this.listExceptions.add(new BirthDateParseException("BirthDate is not found or not corrected format"));
            }if (!phoneNum){
                this.listExceptions.add(new PhoneNumberException("PhoneNumber is not found or not corrected format"));
            }if (!sex){
                this.listExceptions.add(new PhoneNumberException("Sex is not found or not corrected format"));
            }
            return false;
        }
    }

    
}
