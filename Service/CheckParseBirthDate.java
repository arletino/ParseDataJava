package ParseDataJava.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CheckParseBirthDate implements CheckParseData  {
    
    private Date birthDate = null;
    private SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

    @Override
    public boolean checkInputData(String birthDate) {
        if (birthDate.matches("\\d{2}[.]\\d{2}[.]\\d{4}")){
            return true;
        }
        return false;

    }
    public void parsDate(String birthDate) throws ParseException{
        this.birthDate  = this.birthDateFormat.parse(birthDate);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public SimpleDateFormat getBirthDateFormat() {
        return birthDateFormat;
    }

    public void setBirthDateFormat(SimpleDateFormat birthDateFormat) {
        this.birthDateFormat = birthDateFormat;
    }

}
