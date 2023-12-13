package ParseDataJava.Service;

public class CheckParseSex implements CheckParseData {
  
  private String data = "";
  
  @Override
  public boolean checkInputData(String sex) {
    if (sex.matches("[mfFM]")){
      this.data = sex;
      return true;
    }
    return false;
  }
  
  public String getSex(){
    return data;
  }
    
}
