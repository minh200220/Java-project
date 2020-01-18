
package learn.thuchanh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        nhap();
        System.out.println(tong());
    }
    
    public static List<PhanSo> list = new ArrayList<PhanSo> ();

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan so:  ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            PhanSo a = new PhanSo();
            a.nhap();
            list.add(a);
        }
    }

    public static float tong() {
        float sum = 0;
        for (PhanSo x : list) {
            System.out.println(x.giaTri());
            sum += x.giaTri();
        }
        return sum;
    }

    public static PhanSo max() {
        float maxVal = 0;
        PhanSo maxFrac = new PhanSo();
        for (PhanSo x : list) {
            if (x.giaTri() > maxVal)
                maxFrac = x;
        }
        return maxFrac;
    }
}
