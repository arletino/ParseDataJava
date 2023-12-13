package ParseDataJava.Service;


public class CheckParseName implements CheckParseData{

    @Override
    public boolean checkInputData(String name) {
        return name.matches("[А-ЯЁA-Zа-яёa-z]{2,}$");
    }

}
