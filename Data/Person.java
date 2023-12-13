package ParseDataJava.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Person {

    private String firstName = "";
    private String secondName = "";
    private String lastName = "";
    private Date birthDate = null;
    private String phoneNumber = "";
    private Sex sex;

    public Person(String firstName, String secondName, String lastName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Person(){
    }

    public void setSex(String sex){
        if(sex.equals("m")){
            this.sex = Sex.m;
        } else {
            this.sex = Sex.f;
        }

    }


    @Override
    public String toString() {
        SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        if(birthDate == null){
            return "Person [firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName
                + ", birthDate=" + "null" + ", phoneNumber=" + phoneNumber + ", sex=" + sex + "]";
        }
        return "Person [firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName
                + ", birthDate=" + birthDateFormat.format(birthDate) + ", phoneNumber=" + phoneNumber + ", sex=" + sex + "]";
    }
    public String toFile(){
        SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        if(birthDate == null){
            return "< " + firstName + " >< " + secondName + " >< " + lastName
                + " >< " + "null" + " >< " + phoneNumber + " >< " + sex + "\n";
        }
        return "< " + firstName + " >< " + secondName + " >< " + lastName
                + " >< "  + birthDateFormat.format(birthDate) + " >< " + phoneNumber + " >< " + sex + "\n";
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    

}
