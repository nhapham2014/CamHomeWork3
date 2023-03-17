package camjava_4;

import org.junit.Test;

public class Bai1 {
    public String HoTen(String strHo, String strTen) {
      String FirstHo=strHo.substring(0,1);
      String RemainingHo=strHo.substring(1,strHo.length());
      strHo =FirstHo.toUpperCase()+RemainingHo.toLowerCase();
      String FirstTen=strTen.substring(0,1);
      String RemainingTen=strTen.substring(1,strTen.length());
      strTen = FirstTen.toUpperCase()+RemainingTen.toLowerCase();
        String fullName = strHo + " " + strTen;
  System.out.println(fullName);
        return fullName;
    }
    @Test
    public void LietKeHoten(){
        String strHo="pham";
        String strTen="cam";
        HoTen(strHo,strTen);
    }
}
