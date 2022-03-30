package session5lab2;

import java.util.ArrayList;

public class KhachHangNuocNgoai extends KhachHang{
    String quocTich;
    String [] quoctichtuychon = {"Portugal","Argentina","Spain","England"};
    double giaTien;

    public String getQuocTich() {
        return quocTich;
    }
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public double getGiaTien() {
        return giaTien;
    }
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }


    public double tinhTien(){
        if (soluong<=dinhmuc[0]){
            giaTien = soluong*dinhmucgia[0];
        }
        else if (soluong<=dinhmuc[1]){
            giaTien =(soluong)*dinhmucgia[1];
        }
        else if (soluong<=dinhmuc[2]){
            giaTien =(soluong)*dinhmucgia[2];
        }
        else{
            giaTien =(soluong)*dinhmucgia[3];
        }
        return giaTien;
    }
    public void hienThi(){
        super.hienThi();
        System.out.println("Đối tượng khách hàng "+quocTich);
        System.out.println("Giá tiền là "+giaTien);
    }
}
