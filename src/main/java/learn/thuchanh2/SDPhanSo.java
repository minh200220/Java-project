package learn.thuchanh2;

import java.util.*;

public class SDPhanSo {
    public static List<PhanSo> lst = new ArrayList<PhanSo> ();

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan so:  ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            PhanSo a = new PhanSo();
            a.nhap();
            lst.add(a);
        }
    }

    public static float sum() {
        float s = 0;
        for (PhanSo x : lst) {
            System.out.println(x.giaTri());
            s += x.giaTri();
        }
        return s;
    }

    public static PhanSo max() {
        float maxVal = 0;
        PhanSo maxFrac = new PhanSo();
        for (PhanSo x : lst) {
            if (x.giaTri() > maxVal) {
                maxVal = x.giaTri();
                maxFrac = x;
            }
        }
        return maxFrac;
    }

    public static void showList() {
        for (PhanSo x: lst) 
            x.hienThi();
        }

    public static void sortList() {
        Collections.sort(lst, (PhanSo o1, PhanSo o2) -> Float.compare(o1.giaTri(), o2.giaTri()));
        System.out.println("Sorting...");
    }

    public static void main(String[] args) {
        nhap();
        showList();
        sortList();
        showList();
    }
}