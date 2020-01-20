package learn.thuchanh2;

import java.util.Scanner;

public class PhanSo {
  private int tu, mau;

  public PhanSo() {}
  public PhanSo(int tu, int mau) {
    this.tu = tu;
    this.mau = mau;
  }

  public void nhap() {
    while (true) {
      try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tu = sc.nextInt();
        System.out.println("Nhap mau so: ");
        this.mau = sc.nextInt();
        if (this.mau == 0) {
          System.out.println("ERROR: Nhap lai! ");
          continue;
        } else break;
      } catch (Exception e) {
        System.out.println("ERROR: Nhap lai! ");
      }
    }
  }

  public void hienThi() {
    if (this.tu == 0)
      System.out.println("Phan so:" + 0);
    else if (this.mau == 1)
      System.out.println("Phan so:" + this.tu);
    else {
      System.out.println(this.tu + "/" + this.mau);
    }
  }

  public void nghichDao() {
    final int temp = this.tu;
    this.tu  = this.mau;
    this.mau = temp;
  }

  public PhanSo giaTriNghichDao() {
    PhanSo a = new PhanSo(this.mau, this.tu);
    return a;
  }

  public float giaTri() {
    float a = tu;
    float b = mau;
    return (a / b);
  }

  public boolean lonHon(PhanSo a) {
    if (this.giaTri() > a.giaTri())
      return true;
    return false;
  }

  // Operation with fraction
  public PhanSo cong(PhanSo a) {
    final int mau = this.mau * a.mau;
    final int tu = this.tu * a.mau + a.tu * this.mau;
    return (new PhanSo(tu, mau)); 
  }

  public PhanSo tru(PhanSo a) {
    final int mau = this.mau * a.mau;
    final int tu = this.tu * a.mau - a.tu * this.mau;
    return (new PhanSo(tu, mau)); 
  }

  public PhanSo nhan(PhanSo a) {
    return (new PhanSo(this.tu * a.tu, this.mau * a.mau));
  }

  public PhanSo chia(PhanSo a) {
    return (new PhanSo(this.tu * a.mau, this.mau * a.tu));
  }

  // Operation with integer
  public PhanSo cong(int a) {
    final int tu = this.tu + a * this.mau;
    return (new PhanSo(tu, this.mau)); 
  }

  public PhanSo tru(int a) {
    final int tu = this.tu - a * this.mau;
    return (new PhanSo(tu, this.mau)); 
  }

  public PhanSo nhan(int a) {
    return (new PhanSo(this.tu * a, this.mau));
  }

  public PhanSo chia(int a) {
    return (new PhanSo(this.tu, this.mau * a));
  }
}