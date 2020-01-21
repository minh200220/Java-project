
package learn.thuchanh2;

public class SDDiem {
    public static void main(String[] args) {
        Diem A = new Diem(3, 4);
        Diem B = new Diem();
        B.nhapDiem();
        Diem C = new Diem(- B.giaTriX(), - B.giaTriY());
        C.hienThi();
        System.out.println(B.khoangCach());
        System.out.println(A.khoangCach(B));
    }
}
