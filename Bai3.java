package camjava_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Bai3 {
    public int TinhTong(String Chuoi){
        int tong=0;
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < Chuoi.length(); i++) {

            char kytu= Chuoi.charAt(i);
            if(Character.isDigit(kytu)) {
                int number = Character.getNumericValue(kytu);
                numbers.add(number);
                }
            }
        for (int i = 0; i < numbers.size(); i++) {
            tong=tong+numbers.get(i);

        }
return tong;
    }
    @Test
    public void Test_TongSo(){
        String Chuoi="ABC!128KJ7258!116";
        int expect=41;
        int actual=this.TinhTong(Chuoi);
        assertEquals(expect,actual);
    }
}
