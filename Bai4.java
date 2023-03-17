package camjava_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai4 {

    public List<String> DanhSach(String Chuoi) {
        List<String> list = new ArrayList<>();
        List<String> listdup=new ArrayList<>();
        for (int i = 0; i < Chuoi.length(); i++) {
            char kytu=Chuoi.charAt(i);
            list.add(String.valueOf(kytu));

        }
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if(list.get(i).contains(list.get(j))){
                    listdup.add(list.get(i));
                    listdup.add(list.get(j));
                }
            }
        }
        list.removeAll(listdup);
        System.out.println("Chuoi sau khi xóa: " + list);
        return list;
    }
    @Test
    public void Test_DanhSach() {
        String Chuoi = "ab15c1db5!2!ba";
        DanhSach(Chuoi);
    }
}
