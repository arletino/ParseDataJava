package ParseDataJava.Service;

public class CheckQuantityFields implements CheckParseData{

    private int numFields = 6;
    private String delimiter = " ";
    private String[] fields = new String[numFields];

    
    @Override
    public boolean checkInputData(String data) {
        this.fields = data.split(this.delimiter);
        if (this.fields.length != numFields){
            return false;
        } else {
            return true;
        }
    }

    public String[] getParseData() {
       return this.fields;
    }

    public int getNumFields() {
        return numFields;
    }

    public void setNumFields(int numFields) {
        this.numFields = numFields;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }
}
