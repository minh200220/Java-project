/*
 * Java project
 * Made by NQM  * 
 */
package learn.thuchanh2;

import java.util.Scanner;

public class Diem {
    private int x, y;

    public Diem() {};
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        print("Nhap x: ");
        this.x = sc.nextInt();
        print("Nhap y: ");
        this.y = sc.nextInt();
    }

    public void hienThi() {
        print("(" + this.x + "," + this.y + ")");
    }

    public void doiDiem(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int giaTriX() {
        return this.x;
    }

    public int giaTriY() {
        return this.y;
    }

    public double khoangCach() { 
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double khoangCach(Diem d) {
        return Math.sqrt(Math.pow((d.x - this.x), 2) + Math.pow((d.y - this.y), 2));
    }

    public void print(String x) {
        System.out.println(x);
    } 
}
