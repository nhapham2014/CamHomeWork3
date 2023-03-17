package camjava_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Bai3_C2 {
    public int TinhTong(String Chuoi){
        int tong=0;
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < Chuoi.length(); i++) {
            boolean isContainnumber;
            char kytu= Chuoi.charAt(i);
            isContainnumber=Chuoi.contains("0");
            isContainnumber=Chuoi.contains("1");
            isContainnumber=Chuoi.contains("2");
            isContainnumber=Chuoi.contains("3");
            isContainnumber=Chuoi.contains("4");
            isContainnumber=Chuoi.contains("5");
            isContainnumber=Chuoi.contains("6");
            isContainnumber=Chuoi.contains("7");
            isContainnumber=Chuoi.contains("8");
            isContainnumber=Chuoi.contains("9");
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
        int expect=42;
        int actual=this.TinhTong(Chuoi);
        assertEquals(expect,actual);
    }
}
