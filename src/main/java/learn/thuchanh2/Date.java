/*
 * Java project
 * Made by NQM  * 
 */
package learn.thuchanh2;

import java.util.Calendar;
import java.util.Scanner;

public class Date {
    private int ngay, thang, nam;

    public Date() {}
        public Date(int day, int month, int year) {
        this.ngay = day;
        this.thang = month;
        this.nam = year;
    }

    public void hienThi() {
        System.out.println("Hom nay la ngay: " + this.ngay + "/" + this.thang + "/" + this.nam);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
          try {
            print("Nhap ngay: ");
            this.ngay = sc.nextInt();
            print("Nhap thang: ");
            this.thang = sc.nextInt();
            print("Nhap nam: ");
            this.nam = sc.nextInt();
            if (this.hopLe())
                break;
          } catch (Exception e) {
            print("Error: Nhap lai!");
          }
        }
    }

    public boolean hopLe() {
        if (this.nam < 0) return false;
        if ((this.thang < 1) || (this.thang > 12)) return false;
        if ((this.ngay < 1) || (this.ngay > 31)) return false;
        switch (this.thang) {
            case 1: return true;
            case 2: return (isLeap(this.nam) ? this.ngay <= 29 : this.ngay <= 28);
            case 3: return true;
            case 4: return this.ngay < 31;
            case 5: return true;
            case 6: return this.ngay < 31;
            case 7: return true;
            case 8: return true;
            case 9: return this.ngay < 31;
            case 10: return true;
            case 11: return this.ngay < 31;
            default: return true;
        }
    }

    public Date ngayHomSau() {
        Calendar c = (Calendar)Calendar.getInstance();       
        
        c.set(Calendar.MONTH, this.thang-1); 
        c.set(Calendar.YEAR, this.nam); 
        c.set(Calendar.DAY_OF_MONTH, this.ngay);
        c.add(Calendar.DATE, 1);
        
        final int year = c.get(Calendar.YEAR);
        final int month = c.get(Calendar.MONTH);
        final int day = c.get(Calendar.DAY_OF_MONTH);
        return new Date(day, month+1, year);
  }

    public Date congNgay(int n) {
        Calendar c = (Calendar)Calendar.getInstance();       
        
        c.set(Calendar.MONTH, this.thang-1); 
        c.set(Calendar.YEAR, this.nam); 
        c.set(Calendar.DAY_OF_MONTH, this.ngay);
        c.add(Calendar.DATE, n);
        
        final int year = c.get(Calendar.YEAR);
        final int month = c.get(Calendar.MONTH);
        final int day = c.get(Calendar.DAY_OF_MONTH);
        return new Date(day, month+1, year);
    }

    public boolean isLeap(int year) {
        // using system library to do this, avoid re-invent the wheel
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public void print(String s) {
        System.out.println(s);
    }
}