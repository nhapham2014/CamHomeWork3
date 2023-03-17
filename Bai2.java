package camjava_4;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Bai2 {
    public int DemSoNguoiCungTen(String[] ArrayHoTen, String Ten) {
        List<String> ListHoTen = Arrays.asList(ArrayHoTen);
        int dem = 0;

        for (int i = 0; i < ListHoTen.size(); i++) {
            String strName = ListHoTen.get(i);
            boolean containName = strName.contains(Ten);
            if (containName) {
                dem++;
            }
        }
        return dem;
    }

    @Test
    public void Test_DemSoNguoiCungTen() {
        String[] ArrayHoTen = {"Pham Huong", "Tran Mai", "Nguyen Huong"};
        String Ten = "Huong";
        int expect = 2;
        int actual = this.DemSoNguoiCungTen(ArrayHoTen, Ten);
        assertEquals(expect, actual);
    }
}
